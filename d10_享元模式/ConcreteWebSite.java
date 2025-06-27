package d10_享元模式;

public class ConcreteWebSite extends WebSite{

    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User name) {

        System.out.println("网站发表的形式为" + type);
    }
}
