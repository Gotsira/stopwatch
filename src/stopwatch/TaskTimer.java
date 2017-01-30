package stopwatch;

public class TaskTimer {
//	private static Stopwatch watch;
	
//	public TaskTimer() {
//		watch = new Stopwatch();
//	}
	
	public static void measureAndPrint(Runnable runnable) {
		Stopwatch watch = new Stopwatch();
		watch.start();
		runnable.run();
		watch.stop();
		System.out.println( runnable.toString() + ": " + watch.getElapsed() + " seconds");

	}
}
