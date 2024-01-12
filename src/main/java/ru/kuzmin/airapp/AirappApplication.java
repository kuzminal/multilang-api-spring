package ru.kuzmin.airapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kuzmin.airapp.repository.AirportRepo;

@SpringBootApplication
public class AirappApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirappApplication.class, args);
    }

}
