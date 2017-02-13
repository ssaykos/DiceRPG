package beans;

import java.util.Date;

public class user {
	private String name;
	private String nickName;
	private String password;
	private String gold;
	private String experience;
	private int level;
	private item[] inven = new item[50];
	private character[] charac = new character[50];
	private Date date = new Date();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGold() {
		return gold;
	}
	public void setGold(String gold) {
		this.gold = gold;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public item[] getInven() {
		return inven;
	}
	public void setInven(item[] inven) {
		this.inven = inven;
	}
	public character[] getCharac() {
		return charac;
	}
	public void setCharac(character[] charac) {
		this.charac = charac;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
