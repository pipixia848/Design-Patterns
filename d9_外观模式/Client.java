package d9_外观模式;

public class Client {
    public static void main(String[] args) {
        //直接调用麻烦
        //需要写一个外观类

        HomeTheaterFacade h = new HomeTheaterFacade();
        h.ready();

        System.out.println("==========================");
        h.end();
    }
}
