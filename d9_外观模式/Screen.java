package d9_外观模式;

public class Screen {
    //单例模式
    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println(" screen up");
    }

    public void down(){
        System.out.println("screen down");
    }


}
