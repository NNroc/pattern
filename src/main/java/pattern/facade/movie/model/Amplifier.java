package pattern.facade.movie.model;

/**
 * 音响
 *
 * @author NNroc
 * @date 2020/8/14 14:52
 */
public class Amplifier {
    String description;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 打开");
    }

    public void off() {
        System.out.println(description + " 关闭");
    }

    //立体声
    public void setStereoSound() {
        System.out.println(description + " 立体声模式");
    }

    //环绕声
    public void setSurroundSound() {
        System.out.println(description + " 环绕声模式");
    }

    public void setVolume(int level) {
        System.out.println(description + " 调整音量到： " + level);
    }

    public String toString() {
        return description;
    }
}