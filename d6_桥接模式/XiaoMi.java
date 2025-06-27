package d6_桥接模式;

public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米开");
    }

    @Override
    public void close() {

        System.out.println("小米关");
    }

    @Override
    public void call() {

        System.out.println("打电话");
    }
}
