package main.com.pv.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public Integer uid;
    public String uname;
    private String password;
    public String uaccount;
}
