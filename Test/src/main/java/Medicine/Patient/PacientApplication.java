package Medicine.Patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@Repository
public class PacientApplication {

    public static void main(String... args) {
        SpringApplication.run(PacientApplication.class, args);
    }
}
