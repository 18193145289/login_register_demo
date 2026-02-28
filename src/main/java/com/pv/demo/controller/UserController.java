package main.com.pv.demo.controller;

import main.com.pv.demo.entity.User;
import main.com.pv.demo.service.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import main.com.pv.demo.utils.Result;
import main.com.pv.demo.utils.ResultUtil;

@SuppressWarnings({"all"})
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;
    @RequestMapping("/login")
    public Result login(@RequestParam String uact, @RequestParam String pwd){
        String msg = userServiceImpl.loginService(uact,pwd);
        if(("success").equals(msg)){
            return ResultUtil.success("登录成功");
        }else{
            return ResultUtil.error(msg);}
    }
    @RequestMapping("/register")
    public Result register(@RequestBody User user) {
        String msg = userServiceImpl.registerService(user);
        if(("success").equals(msg)){
            return ResultUtil.success("注册成功");
        }else{
            return ResultUtil.error(msg);
        }
    }
}


