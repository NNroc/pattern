package pattern.command.model;

/**
 * 命令 A2
 *
 * @author NNroc
 * @date 2020/8/13 18:27
 */
public class ConcreteCommandA2 implements Command {

    /**
     * 接收者A
     */
    ReceiverA receive;

    public ConcreteCommandA2(ReceiverA receive) {
        this.receive = receive;
    }

    public void execute() {
        // 接收者A执行动作2
        receive.action2();
    }
}
