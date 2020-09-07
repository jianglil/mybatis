package bat.ke.qq.com;

/**
 * 具体处理器.
 */
public class CarHandler extends Handler {

    @Override
    public void chain() {
        System.out.println(this.toString()+" 汽车把妹");
   /*     if (getNextHandler()!=null){   //判断是否存在下一个处理器
            getNextHandler().chain();   //存在则调用下一个处理器
        }*/
    }

}