package cn.gzcc.icollege.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {

    @RequestMapping("/hello")

    public String login(String username, String password) { //@RequestParam(name = "Name",defaultValue = "default") String name
//        User user = new User();
//        user.setAge(18);
//        user.setUsername(name);
        return "login.html";
    }
}
