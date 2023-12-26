package spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicType musicType) {
        String resultPlayingMusic = "";
        int randomMusic = (int) (Math.random() * 3);
        if (musicType == MusicType.RAP) {
            resultPlayingMusic = "Playing: " + music2.getSongs().get(randomMusic);
        } else if (musicType == MusicType.ROCK) {
            resultPlayingMusic = "Playing: " + music1.getSongs().get(randomMusic);
        }
        return resultPlayingMusic;
    }

}
