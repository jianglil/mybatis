package bat.ke.qq.com.excutor;

import bat.ke.qq.com.binding.MapperMethod;
import bat.ke.qq.com.excutor.statement.StatementHandler;
import lombok.SneakyThrows;

/***
 * 简单的执行器
 */
public class SimpleExecutor implements  Executor{
    @SneakyThrows
    @Override
    public <T> T query(MapperMethod method, Object parameter) {
        StatementHandler statementHandler=new StatementHandler();
        return statementHandler.query(method,parameter);
    }
}
