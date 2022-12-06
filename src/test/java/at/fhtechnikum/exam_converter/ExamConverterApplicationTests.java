package at.fhtechnikum.exam_converter;

import at.fhtechnikum.exam_converter.Controller.MetricConverter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ExamConverterApplicationTests {

	@Test
	void contextLoads() {
		// Given
		MetricConverter controller = new MetricConverter();

		// When
		double result_centimeter = controller.convertInchToCentimeter(1);
		double result_meters = controller.convertYardToMeter(1);

		// Then
		assertEquals(result_centimeter, 2.54);
		assertEquals(result_meters, 0.9140767824497257);

	}

}
