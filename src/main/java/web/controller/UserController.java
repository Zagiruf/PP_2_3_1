package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService user) {
        this.userService = user;
    }
    @GetMapping()
    public String show(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", userService.show(count));
        return "users";
    }
}