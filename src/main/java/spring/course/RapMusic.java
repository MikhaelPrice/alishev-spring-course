package spring.course;

public class RapMusic implements Music {

    public RapMusic getRapMusic() {
        return new RapMusic();
    }

    @Override
    public String getSong() {
        return "99 problem";
    }
}
