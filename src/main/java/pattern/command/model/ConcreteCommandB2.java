package pattern.command.model;

/**
 * 命令 B2
 *
 * @author NNroc
 * @date 2020/8/13 18:28
 */
public class ConcreteCommandB2 implements Command {

    /**
     * 接收者B
     */
    ReceiverB receive;

    public ConcreteCommandB2(ReceiverB receive) {
        this.receive = receive;
    }

    public void execute() {
        // 接收者B执行动作2
        receive.action1();
    }
}