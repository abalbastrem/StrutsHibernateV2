package action;

public class LoginAction{

	private String username2;
	private String passwordasd;
	 
	public String getUsername() {
		System.out.println(username2);
		System.out.println(password);
		return username2;
	}

	public void setUsername2(String username) {
		this.username2 = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() {
		
		
		if (this.username2.equalsIgnoreCase("admin"))
			return "SUCCESS";
		else
			return "ERROR";

	}
}