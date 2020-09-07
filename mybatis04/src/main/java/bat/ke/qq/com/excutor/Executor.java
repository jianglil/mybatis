package bat.ke.qq.com.excutor;

import bat.ke.qq.com.binding.MapperMethod;

public interface Executor {

    public  <T> T  query(MapperMethod method,Object parameter);
}
