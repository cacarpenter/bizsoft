package us.craigcarpenter.bizsoft.controller.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import us.craigcarpenter.bizsoft.exception.NotFoundException;
import us.craigcarpenter.bizsoft.svc.session.BizSession;
import us.craigcarpenter.bizsoft.svc.session.BizSessionService;

import javax.inject.Inject;
import java.util.Optional;

@RestController
public class LoginController {
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);

	private final BizSessionService sessionService;

	@Inject
	public LoginController(BizSessionService sessionService) {
		this.sessionService = sessionService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<BizSessionResponse> login(@RequestBody Login login) {
		log.debug("Login {}", login);
		BizSession session = sessionService.login(Login.toLoginCredentials(login)).orElseThrow(
				() -> new NotFoundException() );
		return new ResponseEntity<>(new BizSessionResponse(session), HttpStatus.OK);
	}
}
