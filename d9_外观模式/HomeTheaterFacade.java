package d9_外观模式;

public class HomeTheaterFacade {

    // 定义各个子系统类
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;

    // 构造器
    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
    }

    //操作分4步
    public void ready(){
        popcorn.on();
        popcorn.pop();
        projector.on();
        dvdPlayer.no();
        screen.up();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void end(){
        popcorn.off();
        projector.off();
        dvdPlayer.off();
    }

}
