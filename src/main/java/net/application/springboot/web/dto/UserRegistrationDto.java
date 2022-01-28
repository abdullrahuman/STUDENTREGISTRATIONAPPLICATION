package net.application.springboot.web.dto;

public class UserRegistrationDto {
	private String fisrtname;
	private String lastname;
	private String email;
	private String password;
	
    public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String fisrtname, String lastname, String email, String password) {
		super();
		this.fisrtname = fisrtname;
		
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		
		
	}
	public String getFisrtname() {
		return fisrtname;
	}
	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
