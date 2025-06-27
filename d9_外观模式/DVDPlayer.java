package d9_外观模式;

public class DVDPlayer {

    //单例模式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void no(){
        System.out.println(" dvd on");
    }

    public void off(){
        System.out.println("dvd off");
    }

    public void play(){
        System.out.println("dvd is playing");
    }

    public void pause(){
        System.out.println("dvd is pause");
    }

}
