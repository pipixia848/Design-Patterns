package d13_命令模式.遥控器;

public class Client {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给遥控器设置相关命令
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        remoteController.onButtonWasPushed(0);

    }
}
