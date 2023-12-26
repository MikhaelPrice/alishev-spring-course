package spring.course;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic {

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Initialization...");
    }

    public void destroy() {
        System.out.println("Destroying...");
    }

}
