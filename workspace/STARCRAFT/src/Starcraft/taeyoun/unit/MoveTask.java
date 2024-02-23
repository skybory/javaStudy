package Starcraft.taeyoun.unit;

public class MoveTask implements Runnable {

    private final Unit unit;
    private final int x;
    private final int y;
    
	
    public MoveTask(Unit unit, int x, int y) {
        this.unit = unit;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        unit.move(x, y);
    }
}
