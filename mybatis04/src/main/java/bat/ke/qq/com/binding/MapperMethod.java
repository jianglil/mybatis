package bat.ke.qq.com.binding;

/***
 * sql 和对象返回类型 类
 * @param <T>
 */
public class MapperMethod<T> {

    private String sql;
    private Class<T> type;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Class<T> getType() {
        return type;
    }

    public void setType(Class<T> type) {
        this.type = type;
    }
}
