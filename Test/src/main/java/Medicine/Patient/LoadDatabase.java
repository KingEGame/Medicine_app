package Medicine.Patient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PacientRespository pacientRespository) {

        return args -> {
            log.info("Preloading " + pacientRespository.save(new Pacient("Bilbo Baggins", "Recept")));
            log.info("Preloading " + pacientRespository.save(new Pacient("Frodo Baggins", "Amokcaclin")));
        };
    }
}
