package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.setMusic(RockMusic.getRockMusic());
        musicPlayer.playMusic();

    }

}
