package d14_访问者模式;

public class Client {

    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());


        Success success = new Success();
        objectStructure.display(success);
    }
}
