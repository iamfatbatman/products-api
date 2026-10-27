package uk.ac.westminster.products_api;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, My name is Shisir Chauhan.";
    }

    @GetMapping("/status")
    public String status() {
        return "API running - " + LocalDate.now();
    }

        @GetMapping("/person-age")
    public String personAge(
            @RequestParam int year,
            @RequestParam int month,
            @RequestParam int day) {

        Person person = new Person(
                123,
                "Shisir Chauhan",
                LocalDate.of(year, month, day)
        );

        return person.calculateAge();
    }
    
    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot!";
    }

}
