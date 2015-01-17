package ua.com.vendigo.knurozklad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.com.vendigo.knurozklad.util.TestDataHolder;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 */
@SpringBootApplication
public class Launcher {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Launcher.class, args);
    }

    @Bean
    public TestDataHolder getTestDataHolder() {
        return new TestDataHolder();
    }
}
