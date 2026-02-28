package main.com.pv.demo.service.serviceimpl;

import main.com.pv.demo.mapper.UserMapper;
import main.com.pv.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.com.pv.demo.entity.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public String loginService(String uact, String pwd) {
        User user = userMapper.selectUserByUact(uact);
        if (user!=null){
            String userEpwd = user.getPassword();
            if (pwd.equals(userEpwd)){
                return "success";
            }else{
                return "密码错误";
            }
        }
        return "账号错误";
    }
    public String registerService(User user) {
        User userE = userMapper.selectUserByUact(user.getUaccount());
        if (userE==null){
            if ("".equals(user.getPassword())){
                return "密码为空";
        }else if("".equals(user.getUname())){
                return "用户昵称为空";
            }else{
                userMapper.insertUser(user);
                return "success";
            }
        }else{
            return "此用户已注册";
        }
    }
}
