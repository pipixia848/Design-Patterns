package d6_桥接模式;

public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo开");
    }

    @Override
    public void close() {

        System.out.println("vivo guan");
    }

    @Override
    public void call() {

        System.out.println("vivo dadianhua");
    }
}
