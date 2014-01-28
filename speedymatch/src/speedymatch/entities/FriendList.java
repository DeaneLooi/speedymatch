package speedymatch.entities;

import java.util.ArrayList;

public class FriendList {
	private String userId;
	private ArrayList<String> friendList;

	
	public FriendList(String userId){
		super();
		this.userId = userId;

	}
	
	public FriendList(String userId, ArrayList<String> friendList){
		super();
		this.userId = userId;
		this.friendList = friendList;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public ArrayList<String> getFriendList(){
		return friendList;
	}
	
	public void setFriendList(ArrayList<String>friendList){
		this.friendList = friendList;
	}
	
}
