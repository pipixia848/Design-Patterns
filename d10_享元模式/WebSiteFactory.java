package d10_享元模式;

import java.util.HashMap;

//网站工厂类，根据需求返回一个网站
public class WebSiteFactory {

    //集合，充当池
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type){

        if(!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));
        }

        return (WebSite) pool.get(type);
    }

    //获取数量
    public int getWebSiteCount(){
        return pool.size();
    }
}
