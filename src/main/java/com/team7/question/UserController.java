package com.team7.question;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("hello")
    public String sayHello() {
        User testUser = new User();
        testUser.setName("Berdan");

        userRepository.save(testUser);
        return "Hello guys";
    }
}
