package pattern.command.light;

/**
 * 音响（接收者）
 *
 * @author NNroc
 * @date 2020/8/13 18:30
 */
public class Stereo {

    /**
     * 打开音响
     */
    public void on() {
        System.out.println("Stereo is on");
    }

    /**
     * 关闭音响
     */
    public void off() {
        System.out.println("Stereo is off");
    }

    /**
     * 设置为播放CD
     */
    public void setCd() {
        System.out.println("Stereo is set for CD input");
    }

    /**
     * 设置为播放DVD
     */
    public void setDvd() {
        System.out.println("Stereo is set for DVD input");
    }

    /**
     * 设置音量
     */
    public void setVolume(int volume) {
        System.out.println("Stereo volume set to " + volume);
    }
}