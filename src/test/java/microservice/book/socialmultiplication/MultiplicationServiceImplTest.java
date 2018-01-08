/**
 * 
 */
package microservice.book.socialmultiplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;
import microservices.book.multiplication.domain.User;
import microservices.book.multiplication.domain.multiplication.MultiplicationServiceImpl;
import microservices.book.multiplication.service.RandomGeneratorService;

/**
 * @author yahia
 *
 */
public class MultiplicationServiceImplTest {

	private MultiplicationServiceImpl multiplicationServiceImpl;
	@Mock
	private RandomGeneratorService randomGeneratorService;

	@Before
	public void setUp() {
		// With this call to initMocks we tell Mockito to process the annotations
		MockitoAnnotations.initMocks(this);

		multiplicationServiceImpl = new MultiplicationServiceImpl(randomGeneratorService);
	}

	@Test
	public void createRandomMultiplicationTest() {
		// given (our mocked Random Generator service will return first 50, then 30)
		given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
		// when
		Multiplication multiplication = multiplicationServiceImpl.createRandomMultiplication();
		// assert
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);
	}

	@Test
	public void checkCorrectAttemptTest() {
		// given
		Multiplication multiplication = new Multiplication(50, 60);
		User user = new User("john_doe");
		MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3000);
		// when
		boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
		// assert
		assertThat(attemptResult).isTrue();
	}

	@Test
	public void checkWrongAttemptTest() {
		// given
		Multiplication multiplication = new Multiplication(50, 60);
		User user = new User("john_doe");
		MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3010);
		// when
		boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
		// assert
		assertThat(attemptResult).isFalse();
	}

}
