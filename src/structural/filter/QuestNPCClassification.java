package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class QuestNPCClassification implements NPCClassification{

	@Override
	public List<NPCType> meetClassification(List<NPCType> npcs) {
		List<NPCType> result = new ArrayList<NPCType>();
		for(NPCType npc : npcs){
			if(npc.getType().equalsIgnoreCase("quest")){
				result.add(npc);
			}	
		}
		return result;
	}

}
