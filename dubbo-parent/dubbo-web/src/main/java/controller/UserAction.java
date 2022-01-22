package controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserAction {

    @Reference
    private UserService userService;

    @RequestMapping("/register")
    public String register(Users user) {
        System.out.println("来注册");
        try {
            String nowTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            user.setCreatetime(nowTime);
            userService.register(user);
            return "注册成功！";
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
    }
}