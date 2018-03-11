package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class ActiveNPCClassification implements NPCClassification {

	@Override
	public List<NPCType> meetClassification(List<NPCType> npcs) {
		List<NPCType> result = new ArrayList<NPCType>();
		for(NPCType npc : npcs){
			if(npc.isActive()){
				result.add(npc);
			}	
		}
		return result;
	}

}
