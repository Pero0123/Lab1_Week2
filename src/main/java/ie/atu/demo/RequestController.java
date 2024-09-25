package ie.atu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class RequestController() {
    public String sayHello("/sayHello") {
        return "Hi there";
    }
}
