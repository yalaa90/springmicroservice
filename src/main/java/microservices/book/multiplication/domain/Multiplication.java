package microservices.book.multiplication.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This class represents a Multiplication in our application.
 * 
 * @author yahia
 *
 */
@RequiredArgsConstructor
@Getter
@ToString
@Setter
public final class Multiplication {

	private int factorA;
	private int factorB;
	private int result;

	// Empty constructor for JSON (de)serialization
	Multiplication() {
		this(0, 0);
	}
}
