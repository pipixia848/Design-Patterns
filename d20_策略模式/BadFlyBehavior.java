package d20_策略模式;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 可以飞~~~");
    }
}
