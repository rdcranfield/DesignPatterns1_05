package structural.filter;

public class NPCType {
	
	private String name;
	private String type;
	private boolean isRewarder;
	private boolean isActive;
	
	//type can be quest enemy helper associate
	//if enemy and rewarder get loot
	// if quest and rewarder get quest items or quest prize.
	// is active checked to see if quest still being completed
	// if so then quest Items when not active, then turn active
	// otherwise isActive and questCompleted then quest prize.
	// for enemy, if !isActive player defeated npc, give loot drop.
	
	public NPCType(String name, String type, boolean isRewarder, boolean isActive){
		this.name = name;
		this.type = type;
		this.isRewarder = isRewarder;
		this.isActive = isActive;
		
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public boolean isRewarder() {
		return isRewarder;
	}

	public boolean isActive() {
		return isActive;
	}
	
	@Override
	public String toString(){
		return "NPC:\n [ "+ name + ", type: " + type + ", active: " + isActive + ", rewarder: " + isRewarder + " ]" ;
	}
}
