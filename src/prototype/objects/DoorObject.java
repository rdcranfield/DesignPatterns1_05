package prototype.objects;

public class DoorObject implements MazeObjectPrototype {
    private final String TYPE = "DOOR";

    @Override
    public MazeObjectPrototype clone() {
        return new DoorObject();
    }

    @Override
    public String toString() {
        return TYPE;
    }
}
