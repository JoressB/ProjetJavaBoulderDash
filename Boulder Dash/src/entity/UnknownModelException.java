package entity;


/**
 * UnknownModelException
 *
 * Raises an 'UnknownSpriteException' exception.
 * Given the exception message.
 * @author Fredy MANFOUO
 * @since 2019-06-28
 */
public class UnknownModelException extends Exception {
	/**
	 * Class constructor
	 *
	 * @param  message  Exception backtrace message
	 */
	public UnknownModelException(String message) {
		super(message);
	}
}
