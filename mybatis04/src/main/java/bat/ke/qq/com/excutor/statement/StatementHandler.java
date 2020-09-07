package bat.ke.qq.com.excutor.statement;

import bat.ke.qq.com.binding.MapperMethod;
import bat.ke.qq.com.excutor.result.ResultSetHandler;
import bat.ke.qq.com.util.DbUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;

/***
 * jdbc操作
 */
public class StatementHandler {

    private ResultSetHandler resultSetHandler;

    public StatementHandler() {
        this.resultSetHandler = new ResultSetHandler();
    }

    /***
     * JDBC coder
     * @param method
     * @param parameter
     * @param <T>
     * @return
     */
    public  <T> T  query(MapperMethod method, Object parameter) throws Exception {
        Connection connection = DbUtil.open();
        String sql=String.format(method.getSql(),parameter);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.execute();
        return  resultSetHandler.handleResultSets(preparedStatement,method,parameter);
    }
}
