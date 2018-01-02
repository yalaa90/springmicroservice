package microservices.book.multiplication.domain.multiplication;

import microservices.book.multiplication.domain.Multiplication;

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
}
