/**
 * 
 */
package microservice.book.socialmultiplication;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;

import microservices.book.multiplication.controller.MultiplicationController;
import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.multiplication.MultiplicationService;

/**
 * @author yahia
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MultiplicationController.class)
public class MultiplicationControllerTest {

	@MockBean
	private MultiplicationService multiplicationService;

	@Autowired
	private MockMvc mvc;

	private JacksonTester<Multiplication> json;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		JacksonTester.initFields(this, new ObjectMapper());
	}

	@Test
	public void getRandomMultiplicationTest() throws Exception {

		given(multiplicationService.createRandomMultiplication()).willReturn(new Multiplication(70, 20));

		MockHttpServletResponse response = mvc
				.perform(get("/multiplications/random").accept(MediaType.APPLICATION_JSON)).andReturn().getResponse();
		assertThat(response).isEqualTo(json.write(new Multiplication(70, 20)).getJson());
		
	}

}
