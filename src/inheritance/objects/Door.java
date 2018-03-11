package inheritance.objects;

public class Door extends MazeObject{
	Room roomCurrent;
	Room roomNextDoor;
	public Door(Room r1, Room r2) {
		this.roomCurrent = r1;
		this.roomNextDoor = r2;
	}
}
