package stopwatch;

/**
 * A task that appends chars to StringBuilder.
 * 
 * @author Sirasath Piyapootinun
 *
 */

public class AppendStringBuilder implements Runnable {
	private int size;
	private final char CHAR = 'a';
	
	/**
	 * Initialize the AppendStringBuilder with a specified size given by the user.
	 * The size is the final length of the String.
	 * 
	 * @param size 
	 *             is the final length of the String.
	 */
	public AppendStringBuilder(int size) {
		this.size = size;
	}
	
	/**
	 * Add char 'a' to the StringBuilder until it reaches the final size.
	 */
	@Override
	public void run() {
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < size) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		String result = builder.toString();
	}
	
	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 * 
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", size);
	}
}
