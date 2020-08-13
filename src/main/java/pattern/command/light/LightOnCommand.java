package pattern.command.light;

/**
 * 开灯命令
 *
 * @author NNroc
 * @date 2020/8/13 18:32
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}