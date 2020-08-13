package pattern.command.model;

/**
 * 调用者
 *
 * @author NNroc
 * @date 2020/8/13 18:28
 */
public class Invoker {

    /**
     * 命令对象
     */
    Command command;

    /**
     * 设置命令
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 调用动作
     */
    public void invoke() {
        command.execute();
    }
}