package test;

import entity.Users;
import javafx.scene.chart.PieChart;
import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestDao {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void registerTest() {
        String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Users user = new Users("a11", "1", "2", time);
        userMapper.register(user);
        System.out.println("注册成功");

    }
}
