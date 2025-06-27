package d10_享元模式;

public class Client {
    public static void main(String[] args) {

        //创建一个工厂

        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSiteCategory("新闻");

        WebSite webSite2 = factory.getWebSiteCategory("weixing");

        System.out.println(factory.getWebSiteCount());
    }
}
