package bat.ke.qq.com.mapper;


import bat.ke.qq.com.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * 源码学院-Monkey
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public interface UserMapper {

   @Select("select * from user where id=#{id}")
   public User selectUser(Integer id);
}
