package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1.equals(musicPlayer2));

        musicPlayer1.playMusic();

        musicPlayer1.setVolume(20);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());
    }
}
