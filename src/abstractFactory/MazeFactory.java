package abstractFactory;


import java.util.HashMap;
import java.util.Map;

import inheritance.objects.Door;
import inheritance.objects.Room;
import inheritance.objects.Wall;
import prototype.objects.*;

abstract public class MazeFactory {
	
	public MazeFactory(){};
	
	public Maze MakeMaze(){
		return new Maze();
	};
	public Wall MakeWall(){
		return new Wall();
	};
	public Room MakeRoom(int n){
		return new Room(n);
	};
	public Door MakeDoor(Room r1, Room r2){
		return new Door(r1,r2);
	};
	
	private static final Map<String, MazeObjectPrototype> prototypes = new HashMap<>();

	//initialisation, not required in abstract factory, but essential for the prototype design.
	
    static {
        prototypes.put("room", new RoomObject());
        prototypes.put("wall", new WallObject());
        prototypes.put("door", new DoorObject());
    }
    
    //All can be implemented (including builder) as a singleton.
    //MazeFactory INSTANCE = new MazeFactory(); but class must not be abstract
    
    public static MazeObjectPrototype getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
    
    
  
}	   
