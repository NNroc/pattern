package pattern.command.light;

/**
 * @author NNroc
 * @date 2020/8/13 18:35
 */
public class Test {
    public static void main(String[] args) {
        // 遥控器
        RemoteControl remoteControl = new RemoteControl();

        // 家电
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        // 创建命令，并指定家电
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        // 设置插槽命令
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        // 遥控器执行命令
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}