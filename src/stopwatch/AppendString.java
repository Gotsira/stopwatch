package stopwatch;

public class AppendString implements Runnable {
	private int count;
	public AppendString(int count) {
		this.count = count;
	}
	
	@Override 
	public void run() {
		final char CHAR = 'a';
		String result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", count);
	}

}
