package d13_命令模式.遥控器;

public class LightOnCommand implements Command{

    //把LightReceive聚合到这里
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
