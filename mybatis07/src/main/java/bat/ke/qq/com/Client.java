package bat.ke.qq.com;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
       /* Handler h1 = new BikeHandler();
        Handler h2 = new CarHandler();
        Handler h3 = new AirHandler();
        h1.setNextHandler(h2);   //h1的下一个处理器是h2
         h2.setNextHandler(h3);
        h2.chain();*/

        List<Handler> all=new ArrayList<Handler>();
        all.add(new BikeHandler());
        all.add(new CarHandler());
        for (Handler h:all){
            h.chain();
        }


    }



}