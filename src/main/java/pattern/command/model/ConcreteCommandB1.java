package pattern.command.model;

/**
 * 命令 B2
 *
 * @author NNroc
 * @date 2020/8/13 18:27
 */
public class ConcreteCommandB1 implements Command {

    /**
     * 接收者B
     */
    ReceiverB receive;

    public ConcreteCommandB1(ReceiverB receive) {
        this.receive = receive;
    }

    public void execute() {
        // 接收者B执行动作1
        receive.action1();
    }
}