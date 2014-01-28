
package speedymatch.entities;

public class Messages implements Comparable<Messages> {
	private String sender;
	private String message;
	private String receiver;
	private long date;
	
	public Messages(String sender,String receiver,String message,long date){
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

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
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

	@Override
	public int compareTo(Messages m) {
		int i = 0;
		if(this.getDate() < m.getDate()){
			i = -1;
		}
		else if(this.getDate() == m.getDate()){
			i = 0;
		}
		
		else if(this.getDate() > m.getDate()){
			i = 1;
		}
		return 0;
	}	
}