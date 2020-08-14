package pattern.facade.movie.model;

/**
 * 屏幕
 *
 * @author NNroc
 * @date 2020/8/14 14:51
 */
public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " 上升");
    }

    public void down() {
        System.out.println(description + " 下降");
    }

    public String toString() {
        return description;
    }
}