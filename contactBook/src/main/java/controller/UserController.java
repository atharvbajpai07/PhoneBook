package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository usersRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private final UserController usersControllerFunctions = new UserController();

    private List<User> getAllUsers() {
        return usersRepository.findAll();
    }
}
