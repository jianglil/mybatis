package bat.ke.qq.com.mapper;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //@select标签内容 SQL
        Select annotation = method.getAnnotation(Select.class);
        String sql = annotation.value()[0];
        System.out.println(sql+"====="+args[0]);
        //JDBC代码

        return null;
    }
}
