package bat.ke.qq.com;

/**
 * 抽象处理器
 */
public abstract class Handler {
    //下一个处理器
    private Handler nextHandler;
    //处理方法
    public abstract void chain();

    public Handler getNextHandler() {
        return nextHandler;
    }
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
