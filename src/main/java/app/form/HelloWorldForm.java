package app.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {
	
	private String message;

	String username;
	
	String password;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
