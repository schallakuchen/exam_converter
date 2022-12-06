package at.fhtechnikum.exam_converter.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricConverter {
    @GetMapping("/centimeter/{length_inches}")
    public double convertCentimeter(@PathVariable double length_inches){
        return length_inches * 2.54;
    }
}
