package pattern.facade.movie;

import pattern.facade.movie.model.Amplifier;
import pattern.facade.movie.model.DvdPlayer;
import pattern.facade.movie.model.Projector;
import pattern.facade.movie.model.Screen;
import pattern.facade.movie.model.TheaterLights;

/**
 * 封装类
 *
 * @author NNroc
 * @date 2020/8/14 14:56
 */
public class HomeTheaterFacade {
    public static void watchMovie(String name) {
        Amplifier amp = new Amplifier("Top-O-Line 扬声器");
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD播放器", amp);
        Projector projector = new Projector("Top-O-Line 投影仪", dvd);
        TheaterLights lights = new TheaterLights("客厅灯");
        Screen screen = new Screen("投影仪银幕");

        System.out.println("准备看电影...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(name);
    }
}