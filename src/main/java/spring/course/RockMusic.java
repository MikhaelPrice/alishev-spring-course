package spring.course;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Die, die my Darling";
    }

}
