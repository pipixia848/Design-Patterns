package d1_单例.静态内部类;

import java.util.HashMap;

public class Singleton {

    private static volatile Singleton instance;
    private Singleton(){}

    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance{

        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的共有方法，直接返回SingletonInstance.INSTANCE;
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }


}

enum Singleton2{
    INSTANCE;
    public void sayOK(){
        System.out.println("OK~");
    }
}
