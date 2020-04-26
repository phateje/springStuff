package com.jovanspring.helloworld1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootApplication
public class Helloworld1Application {

    private static final Logger log = LoggerFactory.getLogger(Helloworld1Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Helloworld1Application.class, args);
    }

    // bean is instantiated immediately from SpringApplication.run()
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    // functional interface annotated with bean will also be eagerly instantiated
    @Bean
    public static CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            log.error(quote.toString()); // error just to differentiate it
        };
    }

}
