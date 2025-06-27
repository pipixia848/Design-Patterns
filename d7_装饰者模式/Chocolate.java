package d7_装饰者模式;

public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.5f);
    }
}
