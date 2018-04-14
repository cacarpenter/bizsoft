package us.craigcarpenter.bizsoft.controller.login;

import us.craigcarpenter.bizsoft.svc.session.BizSession;

public class BizSessionResponse {

	private String sessionId;

	public BizSessionResponse(BizSession session) {
		this.sessionId = session.getSessionId();
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}
