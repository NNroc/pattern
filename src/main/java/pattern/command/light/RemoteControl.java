package pattern.command.light;

/**
 * 遥控器（调用者）
 *
 * @author NNroc
 * @date 2020/8/13 18:34
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        // 初始化插槽命令为无命令状态
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 设置插槽命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * “开”按钮被按下
     */
    public void onButtonWasPushed(int slot) {
        // 执行开命令
        onCommands[slot].execute();
    }

    /**
     * “关”按钮被按下
     */
    public void offButtonWasPushed(int slot) {
        // 执行关命令
        offCommands[slot].execute();
    }
}