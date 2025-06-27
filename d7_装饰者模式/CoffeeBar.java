package d7_装饰者模式;

public class CoffeeBar {

    public static void main(String[] args) {

        Drink order = new LongBlack();
        System.out.println(order.cost());


        order = new Milk(order);

        System.out.println(order.cost());

        order = new Chocolate(order);

        System.out.println(order.cost());
    }
}
