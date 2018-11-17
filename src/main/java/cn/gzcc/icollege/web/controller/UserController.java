package cn.gzcc.icollege.web.controller;

import cn.gzcc.icollege.web.dao.UserMapper;
import cn.gzcc.icollege.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/users")
    @ResponseBody
    public List<User> getAll() {
        List<User> users = this.userMapper.getAll();
        return users;
    }
}
