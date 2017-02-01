package stopwatch;

/**
 * A task that adds Double wrapper class in an array.
 * 
 * @author Sirasath Piyapootinun
 *
 */
public class SumDouble implements Runnable {
	private int size;
	static final int ARRAY_SIZE = 500000;
	
	/**
	 * Initializes the SumDouble by the amount.
	 * 
	 * @param size 
	 *             is the amount of times to add the number.
	 */
	public SumDouble(int size) {
		this.size = size;
	}

	/**
	 * Add numbers from 1 to ARRAY_SIZE using Double Wrapper class.
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) {
			values[i] = new Double(i+1);
		}
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for(int count = 0, i = 0; count < size; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}
	
	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 * 
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count = %,d\n", size);
	}
}
