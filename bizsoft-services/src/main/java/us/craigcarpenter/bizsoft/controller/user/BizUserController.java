package us.craigcarpenter.bizsoft.controller.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import us.craigcarpenter.bizsoft.exception.NotFoundException;
import us.craigcarpenter.bizsoft.model.BizUser;
import us.craigcarpenter.bizsoft.svc.user.BizUserService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
public class BizUserController {

	private final BizUserService bizUserService;

	@Inject
	public BizUserController(BizUserService bus) {
		this.bizUserService = bus;
	}

	@RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
	public BizUser getUserById(@PathVariable("userId") String userId) {
		return bizUserService.findById(userId).orElseThrow(() -> new NotFoundException("No such user "+userId));
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ResponseEntity<BizUser> createUser(@Valid @RequestBody BizUser user) {
		System.out.println("Create new user: "+user.getName());
		BizUser createdUser = bizUserService.createUser(user);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}
}
