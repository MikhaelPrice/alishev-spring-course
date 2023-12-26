package spring.course;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic {

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @PostConstruct
    public void init() {
        System.out.println("Initialization...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying...");
    }

}
