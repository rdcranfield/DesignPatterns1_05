package inheritance.objects;

import abstractFactory.MazeGame.Placement;

public class Room extends MazeObject{
	int roomNumber;
	MazeObject northObject = null;
	MazeObject eastObject = null;
	MazeObject southObject = null;
	MazeObject westObject = null;
	
	public Room(int n){
		roomNumber = n;
	}
	public void setSide(Placement position, MazeObject object) {
		if(position == Placement.NORTH){
			northObject = object;
		}else if(position == Placement.EAST){
			eastObject = object;
		}else if(position == Placement.SOUTH){
			southObject = object;
		}else if(position == Placement.WEST){
			westObject = object;
		}
	}
	
}
