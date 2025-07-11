package d7_装饰者模式;

public class Decorator extends Drink{

    private Drink obj;


    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {

        //obj.getDes()输出被装饰者的信息
        return des + " " + getPrice() + "&&" + obj.getDes();
    }
}
