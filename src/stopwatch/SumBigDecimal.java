package stopwatch;

import java.math.BigDecimal;

public class SumBigDecimal implements Runnable {
	private int size;
	static final int ARRAY_SIZE = 500000;
	
	public SumBigDecimal(int size) {
		this.size = size;
	}
	
	@Override
	public void run() {
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
		
		BigDecimal sum = new BigDecimal(0.0);
		for(int count = 0, i = 0; count < size; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
	}
	
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count = %,d\n", size);
	}

}
