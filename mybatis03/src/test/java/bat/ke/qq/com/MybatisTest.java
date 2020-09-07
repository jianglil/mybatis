package bat.ke.qq.com;


import lombok.extern.slf4j.Slf4j;
import bat.ke.qq.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import bat.ke.qq.pojo.User;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-mybatis.xml"})
@Slf4j
public class MybatisTest {


  @Resource(name = "sqlSession")
  SqlSessionTemplate sqlSessionTemplate;

  @Test
  public void testUserMapper2() {
   User user=sqlSessionTemplate.selectOne("bat.ke.qq.com.mybatis.UserMapper.selectUser",101);
   User user2=sqlSessionTemplate.selectOne("bat.ke.qq.com.mybatis.UserMapper.selectUser",101);
   log.info("user:{}",user);
   log.info("user2:{}",user2);

  }

  @Autowired
  private UserMapper userMapper;

  @Test
  public void testUserMapper() {
    User selectUser = userMapper.selectUser(1);
    User selectUser2 = userMapper.selectUser(1);
    log.error("user:{}",selectUser);
    log.error("user2:{}",selectUser2);

  }

}
