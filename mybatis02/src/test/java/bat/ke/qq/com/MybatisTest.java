package bat.ke.qq.com;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 源码学院-Monkey
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Slf4j
public class MybatisTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        SqlSession session2 = sqlSessionFactory.openSession();
        try {
            User user = session.selectOne("bat.ke.qq.com.mybatis.mapper.UserMapper.selectUser", 1);
            User user2 = session2.selectOne("bat.ke.qq.com.mybatis.mapper.UserMapper.selectUser", 1);
            log.info("user:{}", user);
            session.commit();
            log.info("user2:{}", user2);
            User user3 = session.selectOne("bat.ke.qq.com.mybatis.mapper.UserMapper.selectUser", 1);
            log.info("user3:{}", user3);
        } finally {
            session.close();
        }
    }

}
