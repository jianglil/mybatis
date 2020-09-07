package bat.ke.qq.com.mapper;


import org.apache.ibatis.annotations.Select;

public interface BlogMapper {

  @Select("SELECT * FROM blog WHERE id = #{id}")
  Blog selectBlog(int id);
}
