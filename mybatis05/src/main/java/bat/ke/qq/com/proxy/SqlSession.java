package bat.ke.qq.com.proxy;

import bat.ke.qq.com.mapper.UserMapper;

import java.lang.reflect.Proxy;

public class SqlSession {

    /***
     * ClassLoader loader,
     * Class<?>[] interfaces,
     * InvocationHandler h
     * @return
     */
    public static Object getMapper(Class clazz){
       return Proxy.newProxyInstance(SqlSession.class.getClassLoader(),
                new Class[]{clazz},new MapperProxyFactory());

    }
}
