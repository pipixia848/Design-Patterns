package d4_建造者模式;

//抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好，抽象方法
    public abstract void builderBasic();
    public abstract void builderWalls();
    public abstract void roofed();

    //将产品返回
    public House buildHouse(){
        return house;
    }
}
