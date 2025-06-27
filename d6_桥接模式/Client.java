package d6_桥接模式;

public class Client {
    public static void main(String[] args) {

        Phone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
    }
}
