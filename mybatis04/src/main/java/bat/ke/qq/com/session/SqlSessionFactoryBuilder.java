package bat.ke.qq.com.session;


import lombok.SneakyThrows;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {


    @SneakyThrows
    public SqlSessionFactory build(InputStream inputStream){
        Configuration configuration=new Configuration();
        configuration.setInputStream(inputStream);
        configuration.loadConfigurations();
        return new SqlSessionFactory( configuration);
    }
}
