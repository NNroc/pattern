package pattern.command.light;

/**
 * 打开音响播放CD命令
 *
 * @author NNroc
 * @date 2020/8/13 18:33
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}