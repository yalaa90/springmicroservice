package microservices.book.multiplication.domain.multiplication;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

/**
 * @author yahia
 */
public interface MultiplicationService {
	/**
	 * Creates a Multiplication object with two randomly-­ generated factors between
	 * 11 and 99.
	 * 
	 * @return a Multiplication object with random factors
	 */
	Multiplication createRandomMultiplication();

	/**
	 * @return true if the attempt matches the result of the
	 * 
	 *         multiplication, false otherwise.
	 */
	boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
