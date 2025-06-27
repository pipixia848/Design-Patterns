package d5_适配器模式.类适配器;

public class Voltage220V {

    public int output220V(){
        int src = 220;

        System.out.println("电压=" + src);

        return src;
    }
}
