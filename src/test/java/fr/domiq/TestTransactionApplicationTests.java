package fr.domiq;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"some.bar.value=testValue",
})
class TestTransactionApplicationTests {

	@Test
	void contextLoads() {
	}

}
