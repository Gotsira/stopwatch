package stopwatch;

import java.io.IOException;

/**
 * Main class perform several tasks to compare the speed 
 * in using different data types.
 * 
 * @author Sirasath Piyapootinun
 *
 */
public class Main {
	
	/**
	 * Create the tasks and runs the tasks.
	 */
	public static void main(String[] args) throws IOException {
		TaskTimer t = new TaskTimer();
		t.measureAndPrint(new AppendString(50000));
		t.measureAndPrint(new AppendString(100000));
		
		t.measureAndPrint(new AppendStringBuilder(100000));
		
		t.measureAndPrint(new SumDoublePrimitive(1000000000));
		
		t.measureAndPrint(new SumDouble(1000000000));
		
		t.measureAndPrint(new SumBigDecimal(1000000000));
	}
}
