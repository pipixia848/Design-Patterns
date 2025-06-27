package d5_适配器模式.类适配器;

public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器");

        /*
        对象适配器和类适配器大体相同，
        只是VoltageAdapter不在是继承Voltage220v，
        而是将Voltage220v这个类放在构造器中，
        将这两个类聚合起来，
         */
        //对象适配器就不写了

        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
