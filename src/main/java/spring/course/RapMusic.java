package spring.course;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RapMusic implements Music {

    public RapMusic getRapMusic() {
        return new RapMusic();
    }

    @Override
    public List<String> getSongs() {
        return Arrays.asList("99 problem", "Candy Shop", "Million");
    }
}
