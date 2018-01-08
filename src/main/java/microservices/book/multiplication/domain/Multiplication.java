package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
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
@EqualsAndHashCode
public final class Multiplication {

	private final int factorA;
	private final int factorB;
	private int result;

	Multiplication() {
		this(0, 0);
	}
}
