package ua.com.vendigo.knutimetable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.com.vendigo.knutimetable.utils.FlatPairCreator;
import ua.com.vendigo.knutimetable.utils.FlatTimeTableCreator;
import ua.com.vendigo.knutimetable.utils.SnapshotTimeTableCreator;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Launcher.class, args);
    }

    @Bean
    public FlatTimeTableCreator flatTimeTableCreator() {
        return new FlatTimeTableCreator();
    }

    @Bean
    public FlatPairCreator flatPairCreator() {
        return new FlatPairCreator();
    }

    @Bean
    public SnapshotTimeTableCreator SnapshotTimeTableCreator() {
        return new SnapshotTimeTableCreator();
    }
}
