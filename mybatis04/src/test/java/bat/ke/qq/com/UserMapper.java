package bat.ke.qq.com;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {

  @Select("SELECT * FROM user WHERE id = #{id}")
  User selectUser(int id);

}
