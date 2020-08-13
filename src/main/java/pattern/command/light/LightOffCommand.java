package pattern.command.light;

/**
 * 关灯命令
 *
 * @author NNroc
 * @date 2020/8/13 18:32
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}