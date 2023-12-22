package spring.course;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Initialization...");
    }

    public void destroy() {
        System.out.println("Destroying...");
    }

    @Override
    public String getSong() {
        return "Poloness";
    }
}
