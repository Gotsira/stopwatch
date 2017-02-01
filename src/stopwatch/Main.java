package stopwatch;

import java.io.IOException;

public class Main {
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
