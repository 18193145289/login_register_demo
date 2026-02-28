package main.com.pv.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import main.com.pv.demo.entity.User;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User selectUserByUact(String uact);
    String selectUpwdByUact(String uact);
    void insertUser(User user);

}
