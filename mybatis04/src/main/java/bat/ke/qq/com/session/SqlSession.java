package bat.ke.qq.com.session;


import bat.ke.qq.com.binding.MapperMethod;

public interface SqlSession {

    <T> T selectOne(MapperMethod method, Object parameter);

    <T> T getMapper(Class<T> type);



}
