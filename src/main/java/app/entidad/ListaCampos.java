package app.entidad;

import java.io.Serializable;

public class ListaCampos implements Serializable {

    String username;
	
	String password;

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