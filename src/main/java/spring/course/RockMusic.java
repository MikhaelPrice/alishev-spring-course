package spring.course;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    @Override
    public List<String> getSongs() {
        return Arrays.asList("Die, die my Darling", "Hero", "Faint");
    }

}
