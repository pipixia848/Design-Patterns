package d14_访问者模式;

public abstract class Action {

    //得到两个测评

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
