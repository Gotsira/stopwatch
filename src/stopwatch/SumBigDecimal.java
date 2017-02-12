package stopwatch;

import java.math.BigDecimal;

/**
 * Task that add BigDecimal objects in an array.
 * 
 * @author Sirasath Piyapootinun
 *
 */
public class SumBigDecimal implements Runnable {
	private int size;
	static final int ARRAY_SIZE = 500000;
	private BigDecimal[] values;
	/**
	 * Initialize SumBigDecimalTask by the amount.
	 * 
	 * @param amount 
	 * 				 is the amount of times you need to add the number.
	 */
	public SumBigDecimal(int size) {
		this.size = size;
	}
	
	/**
	 * Add numbers from 1 to ARRAY_SIZE using BigDecimal class.
	 */
	@Override
	public void run() {
		values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) {
			values[i] = new BigDecimal(i+1);
		}
		BigDecimal sum = new BigDecimal(0.0);
		for(int count = 0, i = 0; count < size; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
	}
	
	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count = %,d\n", size);
	}

}
