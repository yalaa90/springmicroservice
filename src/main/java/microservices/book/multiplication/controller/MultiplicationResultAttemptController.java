package microservices.book.multiplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import microservices.book.multiplication.domain.multiplication.MultiplicationService;

@RestController
@RequestMapping("/results")
public class MultiplicationResultAttemptController {

	private final MultiplicationService multiplicationService;

	@Autowired
	public MultiplicationResultAttemptController(final MultiplicationService multiplicationService) {
		this.multiplicationService = multiplicationService;
	}

	@RequiredArgsConstructor
	@NoArgsConstructor(force = true)
	@Getter
	public static final class ResultResponse {
		private final boolean correct;

	}

}
