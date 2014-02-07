package speedymatch.entities;

public class Notification {
	
	private String sender;
	private String receiver;
	private String notification;
	
	public Notification(String sender,String receiver,String notification){
		this.sender = sender;
		this.receiver = receiver;
		this.notification = notification;
	}
	
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	
	

}
