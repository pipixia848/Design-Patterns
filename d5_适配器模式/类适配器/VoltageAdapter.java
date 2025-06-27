package d5_适配器模式.类适配器;


//被适配的类
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {

        //获取到220
        int srcV = output220V();
        int dstV = srcV/44;//转成5

        return dstV;
    }
}
