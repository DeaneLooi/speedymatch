package speedymatch.entities;

public class dateController {
 private String midpoint;

public String sendRequest(String initiatorID, String receiverID){
	 try {
	 notification(initiatorID, "wants to date you.", receiverID);
	 }
	 catch (RuntimeException e){
		 return "Please try again";
	 }
	 return "Request sent!";
 };
 
 public String acceptRequest(String initiatorID, String receiverID){
	 try {
		 notification(receiverID, "agrees to date you.", initiatorID);
		 }
		 catch (RuntimeException e){
			 return "Please try again";
		 }
		 return "Request accepted!";
 };
 
 public void declineRequest(String initiatorID, String receiverID) {
		 notification("User not found.", initiatorID);
 }
 
 public boolean readGPS(String initiatorID, String receiverID) {
	 
 }
 
 public String midpoint(String initiatorID, String receiverID) {
	 
 }
 
 public String landmark(String midpoint) {
	 
 }
 
 public String increaseMidpoint (String midpoint) {
	 
 }
 
 public void declineLocation(String initiatorID, String receiverID) {
	 
 }
 
 public void sendTime(String time, String receiverID) {
	 
 }
 
 public void acceptTime(String time, String initiatorID, String receiverID) {
	 
 }
 
 public String anotherLocation(String midpoint, String landmark) {
	 
 }
}
