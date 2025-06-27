package d3_原型模式.克隆羊.improve;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "write");

        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = new Sheep("tom", 1, "write");

        System.out.println(sheep3.hashCode());
        System.out.println(sheep.hashCode());
    }
}
