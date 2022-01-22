package service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import entity.Users;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

@Service  // 暴露服务 （向zookeeper注册服务）
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public int register(Users users) {
        return userMapper.register(users);
    }
}
