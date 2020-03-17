package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataRestApplication {

  private static final Logger log = LoggerFactory.getLogger(AccessingDataRestApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataRestApplication.class);
  }

  @Bean
  public CommandLineRunner demo(PersonRepository repository) {
    return (args) -> {
      repository.save(new Person("Jack", "Bauer"));
      repository.save(new Person("Chloe", "O'Brian"));
      repository.save(new Person("Kim", "Bauer"));
      repository.save(new Person("David", "Palmer"));
      repository.save(new Person("Michelle", "Dessler"));     
    };
  }

}