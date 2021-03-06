package stopwatch;

/**
 * Task that add primitive double in an array.
 * 
 * @author Sirasath Piyapootinun
 *
 */

public class SumDoublePrimitive implements Runnable {
	private int size;
	static final int ARRAY_SIZE = 500000;
	private double[] values;
	
	/**
	 * Initialize SumDoublePrimitive by the amount.
	 * 
	 * @param size 
	 *             is the amount of times to add the number.
	 */
	public SumDoublePrimitive(int size) {
		this.size = size;
	}
	
	/**
	 * Add numbers from 1 to ARRAY_SIZE by using primitive double.
	 */
	@Override
	public void run() {
		// create array of values to add before we start the timer
		values = new double[ARRAY_SIZE];
		for(int k=0; k < ARRAY_SIZE; k++) {
			values[k] = k+1;
		}
		double sum = 0.0;
		// count = loop counter, i = array index value
		for(int count=0, i=0; count < size; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
	}
	
	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of double primitives with count = %,d\n", size );
	}
}
