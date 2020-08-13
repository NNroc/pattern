package pattern.command.light;

/**
 * 关闭音响命令
 *
 * @author NNroc
 * @date 2020/8/13 18:33
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}