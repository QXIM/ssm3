import com.qmm.dao.UserMapper;
import com.qmm.entity.User;
import com.qmm.service.UserService;
import org.junit.Test;

import java.util.List;

public class TestMybatis {

    @Test
    public void TestSelect() {

        UserService userService = new UserService();
        List<User> list = userService.selectAll();
        System.out.println(list);

    }


    public void TestInsert() {

        UserService userMapper = new UserService();
        User user = new User();
        user.setUsername("qxxmm");
        user.setPassword("778899");
//        int result = userMapper.insert(user);

//        System.out.println(result);

    }
}
