package stopwatch;

/**
* A Stopwatch that measures elapsed time between a starting time
* and stopping time, or until the present time.
* 
* @author Sirasath Piyapootinun
* @version 1.0
*/

public class Stopwatch {
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	
	/** Start the stopwatch if it is not already running. */	
	public void start() {
		if(isRunning()) {
			return;
		}
		startTime = System.nanoTime();
	}
	
	/** Stops the stopwatch if it is running. If the stopwatch is already stopped
	 * then it does nothing.
	 */
	public void stop() {
		if(isRunning()) {
			stopTime = System.nanoTime();
		}
		return;
	}
	
	/**
	 * Returns the elapsed time of the stopwatch. If the stopwatch is already running
	 * then it will return the elapsed time between the time at that moment and the 
	 * start time.  If it is stopped, it will return the time between the start and stop
	 * times.
	 * 
	 * @return the elapsed time in seconds with decimals.
	 */
	public double getElapsed() {
		if(isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		}
		return (stopTime - startTime) * NANOSECONDS;
	}
	
	/**
	 * Checks whether the stopwatch is running or not.
	 * 
	 * @return the status of the stop watch. It will true if it is running, otherwise
	 * it will return false. 
	 */
	public boolean isRunning() {
		if(startTime > stopTime) {
			return true;
		}
		return false;
	}
}