package d12_模板方法模式.豆浆制作;

public abstract class SoyaMilk {

    //模板方法，可以做成final，防止子类覆盖
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    //选材
    void select(){
        System.out.println("1，选新鲜的黄豆");
    }

    //添加不同的配料
    abstract void addCondiments();

    //浸泡
    void soak(){
        System.out.println("3, 黄豆和配料浸泡");
    }

    void beat(){
        System.out.println("4， 黄豆和配料放到豆浆机打碎");
    }



}
