package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService user) {
        this.userService = user;
    }
    @GetMapping()
    public String showAllUsers(Model model) {
      List<User> allUsers = userService.gelAllUsers();
      model.addAttribute("users", allUsers);
      return "user";
    }
    @GetMapping("/id")
    public String show(@RequestParam ("id") int id, Model model) {
        model.addAttribute("user", userService.show(id));
        return "user";
    }
    @GetMapping("/new")
    public String newUser(@ModelAttribute("us") User user) {
        return "new";
    }

    @PostMapping()
    public String addNewUser(@ModelAttribute("us") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }
    @GetMapping("/id/edit")
    public String edit(@RequestParam("id") int id, Model model) {
        model.addAttribute("user",userService.show(id));
        return "edit";
    }
    @PatchMapping("/id")
    public String update(@ModelAttribute("user") User user, @RequestParam("id") int id) {
        userService.updateUser(user, id);
        return "redirect:/";
    }

    @DeleteMapping("/id")
    public String delete(@RequestParam("id") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
