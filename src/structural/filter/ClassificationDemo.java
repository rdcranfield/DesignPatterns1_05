package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class ClassificationDemo {
	
	public static void main(String[] args){
		
		//and find active quest npcs.
		
		List<NPCType> npcs = new ArrayList<NPCType>();
		
		boolean isActive = true;
		boolean isRewarder = true;
		npcs.add(new NPCType("dungeon crawlers", "enemy", isActive,isRewarder));
		npcs.add(new NPCType("King Joffrey", "quest", isActive,isRewarder));
		npcs.add(new NPCType("Rich wanderer", "wanderer", isActive,isRewarder));
		
		NPCClassification quest = new QuestNPCClassification();
	    NPCClassification enemy = new EnemyNPCClassification();
	    NPCClassification active = new ActiveNPCClassification();
	    NPCClassification activeQuestNPC = new AndClassification(quest, active);
	     
	    System.out.println("\nQuest NPCs: ");
	    printNPCType( quest.meetClassification(npcs) );
	    System.out.println("\nEnemy NPCs: ");
	    printNPCType( enemy.meetClassification(npcs) );
      
	    System.out.println("\nActive NPCs: ");
	    printNPCType( active.meetClassification(npcs) );
      
	    System.out.println("\nActive Quest NPCs: ");
	    printNPCType( activeQuestNPC.meetClassification(npcs) );
		
	}
	public static void printNPCType(List<NPCType> npcs){
		for( NPCType npc : npcs){
			System.out.println(npc.toString());
		}
	}

}
