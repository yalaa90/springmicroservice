/**
 * 
 */
package microservices.book.multiplication.domain.multiplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.service.RandomGeneratorService;

/**
 * @author yahia
 *
 */
@Service
public class MultiplicationServiceImpl implements MultiplicationService {

	private RandomGeneratorService randomGeneratorService;

	/**
	 * 
	 * @param randomGeneratorService
	 */
	@Autowired
	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
		this.randomGeneratorService = randomGeneratorService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * microservices.book.multiplication.domain.multiplication.MultiplicationService
	 * #createRandomMultiplication()
	 */
	@Override
	public Multiplication createRandomMultiplication() {
		int factorA = randomGeneratorService.generateRandomFactor();
		int factorB = randomGeneratorService.generateRandomFactor();
		return new Multiplication(factorA, factorB);
	}

}
