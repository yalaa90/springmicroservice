/**
 * 
 */
package microservices.book.multiplication.service;

/**
 * @author yahia
 *
 */
public interface RandomGeneratorService {

	/**
	 * @return a randomly-generated factor. It's always anumber between 11 and 99.
	 */
	int generateRandomFactor();
	
}
