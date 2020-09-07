package bat.ke.qq.com;

import static org.junit.Assert.assertTrue;

import bat.ke.qq.com.mapper.UserMapper;
import bat.ke.qq.com.proxy.SqlSession;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    public static void main(String[] args) {
        SqlSession sqlSession=new SqlSession();
        UserMapper mapper = (UserMapper)sqlSession.getMapper(UserMapper.class);
        mapper.selectUser(101);
    }
}
