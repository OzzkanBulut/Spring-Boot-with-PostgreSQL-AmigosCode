package com.amigoscode.tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student ahmet = new Student(
                    "Ahmet",
                    "ahmetk@gmail.com",
                    LocalDate.of(1989, Month.MAY, 22));
            Student alex = new Student(  "Alex", "alex@gmail.com", LocalDate.of(2011, Month.MAY, 13));

            studentRepository.saveAll(List.of(ahmet,alex));
        };
    }

    ;
}
