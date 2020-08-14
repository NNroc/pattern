package pattern.facade.movie.model;

/**
 * 影院灯光
 *
 * @author NNroc
 * @date 2020/8/14 14:51
 */
public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 打开");
    }

    public void off() {
        System.out.println(description + " 关闭");
    }

    public void dim(int level) {
        System.out.println(description + " 亮度调节到：" + level + "%");
    }

    public String toString() {
        return description;
    }
}