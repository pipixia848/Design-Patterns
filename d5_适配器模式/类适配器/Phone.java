package d5_适配器模式.类适配器;

import javax.swing.*;

public class Phone {

    //充电
    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("电压为5V，可充");
        } else  {
            System.out.println("不可充！！！");
        }
    }
}
