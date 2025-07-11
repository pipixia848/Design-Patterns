package d6_桥接模式;

public class FoldedPhone extends Phone{

    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠手机");
    }
    public void close(){
        super.open();
        System.out.println("折叠手机");
    }
    public void call(){
        super.open();
        System.out.println("折叠手机");
    }
}
