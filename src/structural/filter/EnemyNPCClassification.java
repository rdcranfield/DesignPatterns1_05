package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class EnemyNPCClassification implements NPCClassification{

	@Override
	public List<NPCType> meetClassification(List<NPCType> npcs) {
		List<NPCType> result = new ArrayList<NPCType>();
		for(NPCType npc : npcs){
			if(npc.getType().equalsIgnoreCase("enemy")){
				result.add(npc);
			}
		}
		return result;
	}

}
