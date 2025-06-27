package d12_模板方法模式.豆浆制作;

public class RedBeanSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("3. 加入上好的红豆");
    }
}
