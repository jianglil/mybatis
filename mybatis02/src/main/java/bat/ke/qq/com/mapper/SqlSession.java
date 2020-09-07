package bat.ke.qq.com.mapper;

import java.lang.reflect.Proxy;

public class SqlSession {


    public static Object getMapper(Class clazz) {
        return Proxy.newProxyInstance(SqlSession.class.getClassLoader(), new Class[]{clazz}, new MapperProxy());

    }

}
