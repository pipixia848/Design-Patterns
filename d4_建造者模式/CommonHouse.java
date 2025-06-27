package d4_建造者模式;

public class CommonHouse extends HouseBuilder{

    @Override
    public void builderBasic() {
        System.out.println("50米深地基");
    }

    @Override
    public void builderWalls() {
        System.out.println("大理石墙面");
    }

    @Override
    public void roofed() {
        System.out.println("琉璃瓦屋顶");
    }
}
