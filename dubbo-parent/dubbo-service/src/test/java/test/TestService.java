package test;

import entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-*.xml")
public class TestService {

    @Autowired
    private UserService userService;

    @Test
    public void register() {
        String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Users user = new Users("a22", "1", "2", time);
        userService.register(user);
        System.out.println("注册成功");
    }
}
