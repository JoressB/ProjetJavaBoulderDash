package entity;


/**
 * LevelConstraintNotRespectedException
 *
 * Raises an 'LevelConstraintNotRespectedException' exception.
 * Given the exception message.
 *
 * @author Fredy MANFOUO
 
 */
public class LevelConstraintNotRespectedException extends Exception {
    /**
     * Class constructor
     *
     * @param  message  Exception backtrace message
     */
    public LevelConstraintNotRespectedException(String message) {
        super(message);
    }
}
