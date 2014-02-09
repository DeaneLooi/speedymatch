package speedymatch.entities;

import java.util.Date;

public class MemberSecurity {
	
	private String salt;
	
	private String token;
	
	private String membership;
	
	private Date regDate;
	
	private char disabled;
	
	private String communicaton;

	
	public MemberSecurity(String salt, String token, String membership, Date regDate, char disabled){
		
		this.salt = salt;
		this.token = token;
		this.membership = membership;
		this.regDate = regDate;
		this.disabled = disabled;
		
	}
	
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public char getDisabled() {
		return disabled;
	}

	public void setDisabled(char disabled) {
		this.disabled = disabled;
	}
	
	public String getCommunication(){
		return communicaton;
	}
	
	public void setCommunication(String communication){
		this.communicaton = communication;
	}

}
