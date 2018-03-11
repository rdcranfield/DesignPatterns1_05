package builder.npcs;

public class NPCBuilder{
	public static void main(String[] args){
		DungeonCrawler evasiveCrawler = new DungeonCrawler();
		DungeonCrawler attackingCrawler = new DungeonCrawler();

		ActionBuilder evasiveActions = new EvasiveActionBuilder();
		ActionBuilder attackingActions = new AttackingActionBuilder();
		
		evasiveCrawler.setActionBuilder(evasiveActions);
		attackingCrawler.setActionBuilder(attackingActions);
		
		evasiveCrawler.constructActionSet();
		attackingCrawler.constructActionSet();
		
		ActionSet es = evasiveCrawler.getActionSet();
		ActionSet as = attackingCrawler.getActionSet();
		System.out.println(es);
		System.out.println(as);
		
	}
}
