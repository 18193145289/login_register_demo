package main.com.pv.demo.service;
import main.com.pv.demo.entity.User;
public interface UserService {
    public String loginService(String uact, String pwd);
    public String registerService(User user);
}
