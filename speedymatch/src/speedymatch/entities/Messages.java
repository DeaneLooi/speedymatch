
package speedymatch.entities;

import java.util.Date;

public class Messages implements Comparable<Messages> {
	private String sender;
	private String message;
	private String receiver;
	private Date date;
	
	public Messages(String sender,String receiver,String message,Date date){
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public int compareTo(Messages m) {
		// TODO Auto-generated method stub
		int i = 0;
		if(this.getDate().before(m.getDate())) {
			i = -1;
		}
		else if(this.getDate() == m.getDate()){
			i = 0;
		}
	
		else if(this.getDate().after(m.getDate())){
			i = 1;
		}
		return i;
	}
}