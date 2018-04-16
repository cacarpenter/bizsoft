package us.craigcarpenter.bizsoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such object")  // 404
public class NotFoundException extends RuntimeException {
	public NotFoundException() {

	}

	public NotFoundException(String s) {
		super(s);
	}
}
