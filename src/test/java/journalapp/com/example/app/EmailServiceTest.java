package journalapp.com.example.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import journalapp.com.example.app.service.EmailService;  

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail() {
        emailService.sendEmail("shakti.devops12@gmail.com", "Spring Boot Mail Sender", "Testing mail");
    }
}

