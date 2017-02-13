package beans;

public class character {

	private String name;
	private int level;
	private int statePoint;
	private int strong;
	private int dexterity;
	private int life;
	private int intelligence;
	private int atteckDice;
	private int depenceDice;
	private int teamNumber;
	private int experience;
	private item[] install = new item[7];
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getStatePoint() {
		return statePoint;
	}
	public void setStatePoint(int statePoint) {
		this.statePoint = statePoint;
	}
	public int getStrong() {
		return strong;
	}
	public void setStrong(int strong) {
		this.strong = strong;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getAtteckDice() {
		return atteckDice;
	}
	public void setAtteckDice(int atteckDice) {
		this.atteckDice = atteckDice;
	}
	public int getDepenceDice() {
		return depenceDice;
	}
	public void setDepenceDice(int depenceDice) {
		this.depenceDice = depenceDice;
	}
	public int getTeamNumber() {
		return teamNumber;
	}
	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public item[] getInstall() {
		return install;
	}
	public void setInstall(item[] install) {
		this.install = install;
	}
	
}
