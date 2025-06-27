package d13_命令模式.遥控器;

public interface Command {

    //执行操作
    public void execute();

    //撤销操作
    public void undo();
}
