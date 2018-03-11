package builder.npcs;

public class AttackingActionBuilder extends ActionBuilder{

	@Override
	public void buildActiveAction() {
		actionSet.setActiveAction("forceful-aggression");
		
	}

	@Override
	public void buildPassiveAction() {
		actionSet.setPassiveAction("at-leisure-movements");
		
	}
}
