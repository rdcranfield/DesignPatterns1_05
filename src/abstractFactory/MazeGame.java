package abstractFactory;

import inheritance.objects.Door;
import inheritance.objects.DungeonDoor;
import inheritance.objects.DungeonRoom;
import inheritance.objects.DungeonWall;
import inheritance.objects.Room;
import inheritance.objects.Wall;

public class MazeGame{

	public enum Placement {NORTH, EAST, SOUTH, WEST};

	public Maze CreateMaze (MazeFactory factory) {
	   Maze maze = factory.MakeMaze();
	   Room r1 = factory.MakeRoom(1);
	   Room r2 = factory.MakeRoom(2);
	   Door door = factory.MakeDoor(r1, r2);

	   maze.AddRoom(r1);
	   maze.AddRoom(r2);
	   r1.setSide(Placement.NORTH, factory.MakeWall());
       r1.setSide(Placement.EAST, door);
       r1.setSide(Placement.SOUTH,factory.MakeWall());
       r1.setSide(Placement.WEST, factory.MakeWall());
       r2.setSide(Placement.NORTH, factory.MakeWall());
       r2.setSide(Placement.EAST, factory.MakeWall());
       r2.setSide(Placement.SOUTH,factory.MakeWall());
       r2.setSide(Placement.WEST, door);

	   return maze;
	}
	  public class DungeonMazeGame extends MazeGame {
		  	//creation through inheritance
		     public Room makeRoom(int n) {return new DungeonRoom(n);}
		     public Wall makeWall() {return new DungeonWall();}
		     public Door makeDoor(Room r1, Room r2)
		       {return new DungeonDoor(r1, r2);}
	  }
}
