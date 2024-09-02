package journalapp.com.example.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthCheck {

@GetMapping("/health-check")
public String healthCheck() {
    return "Server is running....";
}

}
