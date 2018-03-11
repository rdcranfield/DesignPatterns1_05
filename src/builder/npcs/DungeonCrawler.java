package builder.npcs;

public class DungeonCrawler {
	private ActionBuilder actionBuilder;

	public void setActionBuilder(ActionBuilder actionBuilder) {
		this.actionBuilder = actionBuilder;
	}
	
	public ActionSet getActionSet(){
		return actionBuilder.getActionSet();
	}
	
	public void constructActionSet(){
		actionBuilder.createActionSet();
		actionBuilder.buildActiveAction();
		actionBuilder.buildPassiveAction();
	}

}
