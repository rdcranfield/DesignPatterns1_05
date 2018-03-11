package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class AndClassification implements NPCClassification{

	NPCClassification initialClassification;
	NPCClassification otherClassification;
	public AndClassification(NPCClassification initialClassification, NPCClassification otherClassification){
		this.initialClassification = initialClassification;
		this.otherClassification = otherClassification;
	}
	@Override
	public List<NPCType> meetClassification(List<NPCType> npcs) {
		List<NPCType> initialresultList = initialClassification.meetClassification(npcs);
		return otherClassification.meetClassification(initialresultList);
	}

}
