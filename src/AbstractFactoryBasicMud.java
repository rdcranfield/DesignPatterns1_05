import java.util.Scanner;

public class AbstractFactoryBasicMud {
	
	
	abstract class GenerateWorld{};
	class DungeonWorld extends GenerateWorld{}
	class TownCenterWorld extends GenerateWorld{}
	
	abstract class GenerateNPCs{};
	
	class TownCenterNPCs extends GenerateNPCs{}
	
	class DungeonNPCs extends GenerateNPCs{}
	
	static class Dungeon extends AbstractFactory{

		@Override
		public String GenerateNPCs() {
			// TODO Auto-generated method stub
			return "Dungeon Crawlers";
		}

		@Override
		public String GenerateWorld() {
			// TODO Auto-generated method stub
			return "A dark dungeon meets your gaze";
		}
		
	};
	static class TownCenter extends AbstractFactory{

		@Override
		public String GenerateNPCs() {
			// TODO Auto-generated method stub
			return "Merchants, kinsfolk";
		}

		@Override
		public String GenerateWorld() {
			// TODO Auto-generated method stub
			return "A populous town with people, stalls and houses";
		}
		
	}
		 
	enum Region {
		TOWN, DUNGEON
	}
	abstract static class AbstractFactory {
	    private static final TownCenter TOWN_CENTER = new TownCenter();
	    private static final Dungeon DUNGEON = new Dungeon();

	    // Returns a concrete factory object that is an instance of the
	    // concrete factory class appropriate for the given architecture.
	    static AbstractFactory getFactory(Region region) {
	        AbstractFactory factory = null;
	        switch (region) {
	            case TOWN:
	                factory = TOWN_CENTER;
	                break;
	            case DUNGEON:
	                factory = DUNGEON;
	                break;
	        }
	        return factory;
	    }

	    public abstract String GenerateNPCs();

	    public abstract String GenerateWorld();
	}
	public static void main(String[] args){
		System.out.println("Welcome to MUD BASIC, type exit to leave the game.");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		boolean isPlaying = true;
		
		AbstractFactory factory = null;
		//while(isPlaying){
			factory = AbstractFactory.getFactory(Region.TOWN);
			String region = factory.GenerateWorld();
			String regionNPCs = factory.GenerateNPCs();
			System.out.println("You enter " + region + "\n" + " Press 1 to leave town for the dungeon");
			String userInput = scan.next();
			if(userInput.equals("1")){
				factory = AbstractFactory.getFactory(Region.DUNGEON);
				region = factory.GenerateWorld();
				regionNPCs = factory.GenerateNPCs();
				System.out.println("You enter " + region + "\n" + " Beware of the " + regionNPCs + " Press 1 to return to town");
				userInput = scan.next();
				
			}
		//}
		System.out.println(s);
		//int i = scan.nextInt();
		//while()
		
		//START 
	}

}
