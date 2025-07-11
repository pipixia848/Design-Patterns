package d12_模板方法模式.豆浆制作;

public class PeanutSoyaMike extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("2， 加入花生");
    }
}
