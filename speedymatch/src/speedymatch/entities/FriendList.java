package speedymatch.entities;

public class FriendList {
	private String userId;
	private String Fname;
	private String Lname;
	private String dob;
	private String email;
	private String membership;

	public FriendList(){
		super();
	}
	
	public FriendList(String userId, String Fname, String Lname, String dob, String email, String membership){
		this();
		this.userId = userId;
		this.Fname = Fname;
		this.Lname = Lname;
		this.dob = dob;
		this.email = email;
		this.membership = membership;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}
	
}
