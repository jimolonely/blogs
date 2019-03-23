package com.jimo.api;

import com.jimo.api.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author jimo
 * @date 19-3-23 下午6:31
 */
@RequestMapping
@RestController
public class ApiController {

    @GetMapping("/user")
    public User getUser() {
        return new User("jimo", "123456");
    }

    @PostMapping("/user")
    public User postUser(User user){
        return user;
    }

    @PostMapping("/user2")
    public User postUser2(@RequestParam User user){
        return user;
    }
}
