package mapper;

import entity.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper {

    public int register(Users users);
}
