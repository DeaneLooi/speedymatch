package speedymatch.entities;

public class Horoscope {

	private String horoscope;
	private String horoscopeDesc;
	private int horoscopeID;

	public Horoscope() {

	}

	public Horoscope(String horoscope) {

		this.horoscope = horoscope;

	}

	public Horoscope(int horoscopeID, String horoscopeDesc) {

		this.horoscopeID = horoscopeID;
		this.horoscopeDesc = horoscopeDesc;
	}

	public String getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(String horoscope) {
		this.horoscope = horoscope;
	}

	public String getHoroscopeDesc() {
		return horoscopeDesc;
	}

	public void setHoroscopeDesc(String horoscopeDesc) {
		this.horoscopeDesc = horoscopeDesc;
	}

	public int getHoroscopeID() {
		return horoscopeID;
	}

	public void setHoroscopeID(int horoscopeID) {
		this.horoscopeID = horoscopeID;
	}
}
