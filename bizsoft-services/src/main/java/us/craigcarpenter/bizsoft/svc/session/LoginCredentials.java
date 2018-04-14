package us.craigcarpenter.bizsoft.svc.session;

public class LoginCredentials {

	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public LoginCredentials setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public LoginCredentials setPassword(String password) {
		this.password = password;
		return this;
	}
}
