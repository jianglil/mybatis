package bat.ke.qq.com.proxy;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperProxyFactory implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Select annotation = method.getAnnotation(Select.class);
        String s = annotation.value()[0];
        Object arg = args[0];
        System.out.println("sql::::" + s + "::::::::arg:" + arg);
        return null;
    }
}
