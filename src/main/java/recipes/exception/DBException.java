/**
 * 
 */
package recipes.exception;

/**
 * 
 */
@SuppressWarnings("serial")
public class DBException extends RuntimeException {

	/**
	 * 
	 */
	public DBException() {
	}

	/**
	 * @param message
	 */
	public DBException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public DBException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DBException(String message, Throwable cause) {
		super(message, cause);
	}
}
