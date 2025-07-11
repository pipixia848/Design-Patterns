package d4_建造者模式;

//指挥者，动态指定制作流程
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //setter传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子流程，交给指挥者
    public House constructHouse(){
        houseBuilder.builderBasic();
        houseBuilder.builderWalls();
        houseBuilder.roofed();

        return houseBuilder.buildHouse();
    }
}
