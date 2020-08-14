package pattern.facade.movie;

import pattern.facade.movie.model.Amplifier;
import pattern.facade.movie.model.DvdPlayer;
import pattern.facade.movie.model.Projector;
import pattern.facade.movie.model.Screen;
import pattern.facade.movie.model.TheaterLights;

/**
 * 内部已经封装好，可直接调用
 * @author NNroc
 * @date 2020/8/14 14:55
 */
public class TestWithFacade {
    public static void main(String[] args) {
        String name="电影名";
        //看电影
        HomeTheaterFacade.watchMovie(name);
    }
}
