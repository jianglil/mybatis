package bat.ke.qq.com.mapper;

public class Test {

    public static void main(String[] args) {
        SqlSession sqlSession = new SqlSession();
        BlogMapper blogMapper = (BlogMapper)sqlSession.getMapper(BlogMapper.class);
        Blog blog = blogMapper.selectBlog(101);


    }
}
