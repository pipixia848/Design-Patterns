package d1_单例.懒汉式;

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    //提供一个静态的共有方法，当使用到该方法时，才创建instance
    //线程不安全

    //线程安全式
    // public static synchronized Singleton getInstance()
    //在构造方法时，加上synchronized 即可以解决

    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
