package bat.ke.qq.com.session;

import bat.ke.qq.com.binding.MapperMethod;
import bat.ke.qq.com.binding.MapperProxy;
import bat.ke.qq.com.excutor.Executor;

import java.lang.reflect.Proxy;

/***
 * 执行器做
 */
public class DefaultSqlSession implements  SqlSession {


    Configuration configuration;
    Executor executor;

    public DefaultSqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    @Override
    public <T> T selectOne(MapperMethod method, Object parameter) {
        return executor.query(method,parameter);
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return (T) Proxy.newProxyInstance(type.getClassLoader(),new Class[]{type},new MapperProxy(this,type));
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public Executor getExecutor() {
        return executor;
    }
}
