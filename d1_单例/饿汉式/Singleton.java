package d1_单例.饿汉式;

public class Singleton {

    //1.构造器私有化
    private Singleton(){

    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个共有的静态方法，返回对象实例
    public static Singleton getInstance(){
        return instance;
    }
}
