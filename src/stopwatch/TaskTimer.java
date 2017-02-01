package stopwatch;

/**
 * TaskTimer class will measure the elapsed time in seconds of a specific task.
 * 
 * @author Sirasath Piyapootinun
 *
 */

public class TaskTimer {
	
	/**
	 * Runs a task, measures and prints its running time to the console.
	 * 
	 * @param runnable
	 *            is a task to be run.
	 * 
	 */
	public static void measureAndPrint(Runnable runnable) {
		Stopwatch watch = new Stopwatch();
		watch.start();
		runnable.run();
		watch.stop();
		System.out.println( runnable.toString() + ": " + watch.getElapsed() + " seconds");

	}
}
