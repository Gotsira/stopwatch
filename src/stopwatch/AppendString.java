package stopwatch;

/**
 * A task that appends chars to String.
 * 
 * @author Sirasath Piyapootinun
 *
 */

public class AppendString implements Runnable {
	private int size;
	private final char CHAR = 'a';
	
	/**
	 * Initialize the AppendString with a specified size given by the user.
	 * The size is the final length of the String.
	 * 
	 * @param size 
	 *             is the final length of the String.
	 */
	public AppendString(int size) {
		this.size = size;
	}
	
	/**
	 * Add char 'a' to the String until it reaches the final size.
	 */
	@Override 
	public void run() {
		
		String result = ""; 
		int k = 0;
		while(k++ < size) {
			result = result + CHAR;
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
		return String.format("Append %,d chars to String\n", size);
	}

}
