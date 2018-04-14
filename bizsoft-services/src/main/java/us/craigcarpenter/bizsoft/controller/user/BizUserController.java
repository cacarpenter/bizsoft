package us.craigcarpenter.bizsoft.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.craigcarpenter.bizsoft.model.BizUser;

import javax.websocket.server.PathParam;

@RestController
public class BizUserController {

	@RequestMapping(value = "/users/{userId}")
	public BizUser getUserById(@PathParam("userId") String userId) {
		return new BizUser();
	}

}
