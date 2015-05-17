package ua.com.vendigo.knutimetable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.com.vendigo.knutimetable.timetable.TimeTableCreator;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Launcher.class, args);
    }

    @Bean
    public TimeTableCreator timeTableCreator() {
        return new TimeTableCreator();
    }
}
