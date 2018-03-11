package builder.npcs;

public class EvasiveActionBuilder extends ActionBuilder{

	@Override
	public void buildActiveAction() {
		actionSet.setActiveAction("retreat/flee");
		
	}

	@Override
	public void buildPassiveAction() {
		actionSet.setPassiveAction("slow-uncertain-movements");
		
	}
	
}
