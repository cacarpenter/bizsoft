package us.craigcarpenter.bizsoft.controller.login;

import jdk.jfr.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody Login login) {
		System.out.println("Login");
		System.out.println(login.getLoginId());
		return new ResponseEntity<>("{}", HttpStatus.OK);
	}
}
