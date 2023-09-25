package com.learnprojects.learnrestapi.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private UserDetailsRepository repository;

    public UserDetailsCommandLineRunner(UserDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new UserDetails("Ranga", "Admin"));
        repository.save(new UserDetails("Ravi", "Admin"));
        repository.save(new UserDetails("John", "User"));

//        List<UserDetails> users = repository.findAll();
        List<UserDetails> users = repository.findByRole("Admin");

        users.forEach(user -> logger.info(user.toString()));
    }
}
