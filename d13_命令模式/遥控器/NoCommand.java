package d13_命令模式.遥控器;


/**
 * 没有任何命令，空执行
 * 用于初始化按钮，当调用空命令时，对象什么都不做
 * 这是一种设计模式，可以省略对空的判断
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
