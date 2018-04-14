package us.craigcarpenter.bizsoft.controller.login;

import us.craigcarpenter.bizsoft.svc.session.LoginCredentials;

public class Login {
	private String loginId;
	private String paz;

	public Login() {

	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPaz() {
		return paz;
	}

	public void setPaz(String paz) {
		this.paz = paz;
	}

	public static LoginCredentials toLoginCredentials(Login l) {
		return new LoginCredentials().setUsername(l.loginId).setPassword(l.paz);
	}

	@Override
	public String toString() {
		return "Login{" +
				"loginId='" + loginId + '\'' +
				'}';
	}
}
