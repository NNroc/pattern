package pattern.command.model;

/**
 * 命令 A1
 *
 * @author NNroc
 * @date 2020/8/13 18:26
 */
public class ConcreteCommandA1 implements Command {

    /**
     * 接收者A
     */
    ReceiverA receive;

    public ConcreteCommandA1(ReceiverA receive) {
        this.receive = receive;
    }

    public void execute() {
        // 接收者A执行动作1
        receive.action1();
    }
}