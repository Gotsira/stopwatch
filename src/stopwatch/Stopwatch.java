package stopwatch;

public class Stopwatch {
	private long startTime;
	private long stopTime;
	private static final double NANOSECONDS = 1.0E-9;
	
	public Stopwatch() {
		
	}
	
	public void start() {
		if(isRunning()) {
			return;
		}
		startTime = System.nanoTime();
	}
	
	public void stop() {
		if(isRunning()) {
			stopTime = System.nanoTime();
		}
		return;
	}
	
	public double getElapsed() {
		if(isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		}
		return (stopTime - startTime) * NANOSECONDS;
	}
	
	public boolean isRunning() {
		if(startTime > stopTime) {
			return true;
		}
		return false;
	}
}