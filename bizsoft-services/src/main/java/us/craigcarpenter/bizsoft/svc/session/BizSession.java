package us.craigcarpenter.bizsoft.svc.session;

public class BizSession {
	private String sessionId;

	public BizSession setSessionId(String sid) {
		this.sessionId = sid;
		return this;
	}

	public String getSessionId() {
		return sessionId;
	}
}
