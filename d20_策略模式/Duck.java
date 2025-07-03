package d20_策略模式;

public abstract class Duck {

    // 属性， 策略接口
    FlyBehavior flyBehavior;

    public Duck(){}

    public abstract void display();

    public void fly() {

        if (this.flyBehavior != null) {
            flyBehavior.fly();
        }
    }

}
