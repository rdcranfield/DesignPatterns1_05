
public class AbstractFactoryImpl {
	
	abstract class lifeform{};
	
	abstract class attack{};
	
	abstract class run{};
	
	
	//action 
	
	
	
	public static void main(int world){
		if(world == 1 ){
			//trading world
			
			
		}else if(world == 2){
			//fighting world
		}
		
	}

	class Action implements Cloneable{
	    public String str;

	    public Action(String str) {
	        this.str = str;
	    }

	    @Override
	    public Action clone() {
	    	Action clone = null;
	        try {
	            clone = (Action)super.clone();
	        } catch (CloneNotSupportedException ex) {
	            ex.printStackTrace();
	        }
	        return clone;
	    }//angry attack. happy befriend, wise or ignorant

	    @Override
	    public String toString() {
	        return str;
	    }
	}

}
