package prototype.objects;

public class RoomObject implements MazeObjectPrototype {
    private final String TYPE = "ROOM";

    @Override
    public MazeObjectPrototype clone() {
        return new RoomObject();
    }

    @Override
    public String toString() {
        return TYPE;
    }
}
