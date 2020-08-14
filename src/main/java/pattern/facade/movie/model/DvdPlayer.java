package pattern.facade.movie.model;

/**
 * 播放器
 *
 * @author NNroc
 * @date 2020/8/14 14:53
 */
public class DvdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " 播放");
    }

    public void off() {
        System.out.println(description + " 关闭");
    }

    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        System.out.println(description + " 播放 \"" + movie + "\"");
    }

    public String toString() {
        return description;
    }
}