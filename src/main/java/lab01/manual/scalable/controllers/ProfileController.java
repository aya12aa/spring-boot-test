package lab01.manual.scalable.controllers;

import lab01.manual.scalable.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class ProfileController {
    
    @GetMapping("/me")
    public User getMyProfile() {
        // Return a dummy user profile
        return new User("current-user", "Current User", 25, "current@example.com");
    }
}