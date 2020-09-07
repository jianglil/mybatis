package bat.ke.qq.com;

import bat.ke.qq.com.session.SqlSession;
import bat.ke.qq.com.session.SqlSessionFactory;
import bat.ke.qq.com.session.SqlSessionFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
@Slf4j
public class MybatisMain {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";//全局配置
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser(101);
        log.info("user:{}",user);


    }
}
