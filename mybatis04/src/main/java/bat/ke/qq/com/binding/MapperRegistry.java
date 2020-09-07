package bat.ke.qq.com.binding;

import java.util.HashMap;
import java.util.Map;

/***
 * MapperMethod >map
 */
public class MapperRegistry {
    private Map<String,MapperMethod> KnownMappers=new HashMap<String,MapperMethod>();

    public Map<String, MapperMethod> getKnownMappers() {
        return KnownMappers;
    }

    public void setKnownMappers(Map<String, MapperMethod> knownMappers) {
        KnownMappers = knownMappers;
    }
}
