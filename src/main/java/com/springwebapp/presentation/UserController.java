package com.springwebapp.presentation;

import com.springwebapp.model.SlackUser;
import com.springwebapp.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
public class UserController
{
    @Autowired
    public UserRepository userRepository;

    @RequestMapping("/")
    public String home()
    {
        System.out.println("Home page");
        return "home";
    }

    @RequestMapping("/save")
    public String newUser(SlackUser user)
    {
        // just for testing
        userRepository.save(new SlackUser("Claudia", "email@gmail.com"));
        userRepository.save(user);
        return "saved";
    }

    @RequestMapping("/allUsers")
    public String allUsers()
    {
        userRepository.findAll();
        return "allUsers";
    }
}
