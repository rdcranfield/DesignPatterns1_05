package prototype.objects;

public class WallObject implements MazeObjectPrototype {
    private final String TYPE = "WALL";

    @Override
    public MazeObjectPrototype clone() {
        return new WallObject();
    }

    @Override
    public String toString() {
        return TYPE;
    }
}
