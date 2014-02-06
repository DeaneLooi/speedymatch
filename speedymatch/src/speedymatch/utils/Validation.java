package speedymatch.utils;

public class Validation {
	
	public static boolean checkUsername(String username){
		
		if(username.matches(".*[<>,!?()].*")) return false;
		
		return true;
		
	}

}
