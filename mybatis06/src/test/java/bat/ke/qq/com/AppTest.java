package bat.ke.qq.com;


import bat.ke.qq.com.mapper.UserMapper;
import bat.ke.qq.com.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring.xml")
public class AppTest 
{
    @Autowired
    UserMapper userMapper;

    @Test
    public void insert(){
        User user=new User();
        user.setId(123l);
        user.setAge(18);
        user.setEmail("abc@abc.com");
        user.setName("monkey老师");
        userMapper.insert(user);
    }

    @Test
    public void list(){
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
