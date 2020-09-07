package bat.ke.qq.com.session;

import bat.ke.qq.com.excutor.Executor;
import bat.ke.qq.com.excutor.SimpleExecutor;


public class SqlSessionFactory {

    private Configuration configuration;

    public SqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public SqlSession openSession(){
        Executor simpleExecutor = new SimpleExecutor();
        return  new  DefaultSqlSession(configuration,simpleExecutor);
    }
}
