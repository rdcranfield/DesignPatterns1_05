package builder.npcs;

public class ActionSet {
	private String activeAction = "";
	private String passiveAction = "";
	
	public void setActiveAction(String activeAction) {
		this.activeAction = activeAction;
	}
	public void setPassiveAction(String passiveAction) {
		this.passiveAction = passiveAction;
	}
	
	@Override
	public String toString(){
		return "Active Action: " + activeAction + " Passive Action: " + passiveAction;
	}
	

}
