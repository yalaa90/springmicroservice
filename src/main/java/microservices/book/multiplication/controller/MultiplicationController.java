package microservices.book.multiplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.multiplication.MultiplicationService;

@RestController
@RequestMapping("/multiplications")
public final class MultiplicationController {

	private final MultiplicationService multiplicationService;

	@Autowired
	public MultiplicationController(final MultiplicationService xmultiplicationService) {
		multiplicationService = xmultiplicationService;
	}

	@GetMapping("/random")
	public Multiplication getRandomMultiplication() {
		return multiplicationService.createRandomMultiplication();
	}
}
