/**
 * 
 */
package microservices.book.multiplication.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author yahia Stores information to identify the user.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class User {

	private final String alias;

	// Empty constructor for JSON (de)serialization
	protected User() {
		alias = null;
	}
}
