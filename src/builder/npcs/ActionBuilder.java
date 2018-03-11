package builder.npcs;

abstract class ActionBuilder {
	protected ActionSet actionSet;
	
	public ActionSet getActionSet() {
		return actionSet;
	}
	public void createActionSet() {
		this.actionSet = new ActionSet();
	}
	
	public abstract void buildActiveAction();
	public abstract void buildPassiveAction();
	

}
