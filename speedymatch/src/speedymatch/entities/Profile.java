package speedymatch.entities;

public class Profile {

	private String username;
	private int age;
	private String gender;
	private String eduLevel;
	private String hobby;
	private int height;
	private int weight;
	private String race;
	private String religion;
	private String child;
	private String horo;
	private String occupation;
	private String smoking;
	private String drinking;
	private String relaStatus;

	public Profile(String username) {
		this.username = username;
	}

	public Profile(int age, String gender, String eduLevel, String hobby,
			int height, int weight, String race, String religion, String child,
			String horo, String occupation, String smoking, String drinking,
			String relaStatus) {
		super();
		this.age = age;
		this.gender = gender;
		this.eduLevel = eduLevel;
		this.hobby = hobby;
		this.height = height;
		this.weight = weight;
		this.race = race;
		this.religion = religion;
		this.child = child;
		this.horo = horo;
		this.occupation = occupation;
		this.smoking = smoking;
		this.drinking = drinking;
		this.relaStatus = relaStatus;
	}

	public Profile(String username, int age, String gender, String eduLevel,
			String hobby, int height, int weight, String race, String religion,
			String child, String horo, String occupation, String smoking,
			String drinking, String relaStatus) {
		super();
		this.username = username;
		this.age = age;
		this.gender = gender;
		this.eduLevel = eduLevel;
		this.hobby = hobby;
		this.height = height;
		this.weight = weight;
		this.race = race;
		this.religion = religion;
		this.child = child;
		this.horo = horo;
		this.occupation = occupation;
		this.smoking = smoking;
		this.drinking = drinking;
		this.relaStatus = relaStatus;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEduLevel() {
		return eduLevel;
	}

	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

	public String getHoro() {
		return horo;
	}

	public void setHoro(String horo) {
		this.horo = horo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSmoking() {
		return smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public String getDrinking() {
		return drinking;
	}

	public void setDrinking(String drinking) {
		this.drinking = drinking;
	}

	public String getRelaStatus() {
		return relaStatus;
	}

	public void setRelaStatus(String relaStatus) {
		this.relaStatus = relaStatus;
	}

	public Profile() {
	}

	public Profile(String gender, String eduLevel, String hobby, int height,
			int weight, String race, String religion, String child,
			String horo, String occupation, String smoking, String drinking,
			String relaStatus) {

		this.gender = gender;
		this.eduLevel = eduLevel;
		this.hobby = hobby;
		this.height = height;
		this.weight = weight;
		this.race = race;
		this.religion = religion;
		this.child = child;
		this.horo = horo;
		this.occupation = occupation;
		this.smoking = smoking;
		this.drinking = drinking;
		this.relaStatus = relaStatus;

	}

}
