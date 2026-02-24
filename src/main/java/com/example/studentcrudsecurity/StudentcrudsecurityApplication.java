package com.example.studentcrudsecurity;

import com.example.studentcrudsecurity.model.Role;
import com.example.studentcrudsecurity.model.User;
import com.example.studentcrudsecurity.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class StudentcrudsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentcrudsecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner createUsers(UserRepository userRepository,
                                  PasswordEncoder passwordEncoder) {

        return args -> {

            if (userRepository.count() == 0) {

                User admin = new User();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin123"));
                admin.setRole(Role.ADMIN);

                User user = new User();
                user.setUsername("user");
                user.setPassword(passwordEncoder.encode("user123"));
                user.setRole(Role.USER);

                userRepository.save(admin);
                userRepository.save(user);

                System.out.println(" Default users created");
            }
        };
    }
}