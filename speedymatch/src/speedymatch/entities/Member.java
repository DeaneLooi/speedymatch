package speedymatch.entities;

import java.util.Date;

public class Member {

	private String username;

	private String passwd;

	private String email;

	private String Fname;

	private String Lname;

	private Date dob;

	private MemberSecurity memberSecurity;

	public Member(String username, String passwd) {

		this.username = username;
		this.passwd = passwd;
	}

	public Member(String username, String passwd, String email, String Fname,
			String Lname, Date dob) {

		this.username = username;
		this.passwd = passwd;
		this.email = email;
		this.Fname = Fname;
		this.Lname = Lname;
		this.dob = dob;
	}

	public Member(String username, String email, String fname, String lname,
			Date dob) {
		super();
		this.username = username;
		this.email = email;
		Fname = fname;
		Lname = lname;
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public MemberSecurity getMemberSecurity() {
		return memberSecurity;
	}

	public void addMemberSecurity(MemberSecurity memberSecurity) {
		this.memberSecurity = memberSecurity;
	}

}
