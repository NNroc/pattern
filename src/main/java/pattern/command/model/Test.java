package pattern.command.model;

/**
 * @author NNroc
 * @date 2020/8/13 18:29
 */
public class Test {
    public static void main(String[] args) {
        // 命令调用者
        Invoker invoker = new Invoker();

        // 命令接收者
        ReceiverA receiverA = new ReceiverA();
        ReceiverB receiverB = new ReceiverB();

        // 创建命令，并指定接收者
        Command commandA1 = new ConcreteCommandA1(receiverA);
        Command commandA2 = new ConcreteCommandA2(receiverA);
        Command commandB1 = new ConcreteCommandB1(receiverB);
        Command commandB2 = new ConcreteCommandB2(receiverB);

        // 调用者执行命令
        invoker.setCommand(commandA1);
        invoker.invoke();
        invoker.setCommand(commandA2);
        invoker.invoke();
        invoker.setCommand(commandB1);
        invoker.invoke();
        invoker.setCommand(commandB2);
        invoker.invoke();
    }
}