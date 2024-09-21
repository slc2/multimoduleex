package learn.lynn.controllers;

import learn.lynn.commands.UserCommand;
import learn.lynn.entities.User;

// not a real controller, example for showing dependencies
// between modules
public class UserController {
    User saveUser(UserCommand command) {
        return new User();
    }
}
