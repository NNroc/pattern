package pattern.facade.movie.model;

/**
 * 投影仪
 *
 * @author NNroc
 * @date 2020/8/14 14:52
 */
public class Projector {
    String description;
    DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println(description + " 打开");
    }

    public void off() {
        System.out.println(description + " 关闭");
    }

    public void wideScreenMode() {
        System.out.println(description + " 调整到宽屏模式");
    }

    public void tvMode() {
        System.out.println(description + " 调整到tv模式");
    }

    public String toString() {
        return description;
    }
}