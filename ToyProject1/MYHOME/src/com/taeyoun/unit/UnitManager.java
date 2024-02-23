package com.taeyoun.unit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

	public class UnitManager {

	    private final ExecutorService executorService;

	    public UnitManager() {
	        this.executorService = Executors.newCachedThreadPool();
	    }

	/*    public void moveUnitAsync(Unit unit, int x, int y) {
	        executorService.submit(() -> unit.move(x, y));
	    }
*/
	    public void shutdown() {
	        executorService.shutdown();
    }
}

