package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

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

    @Override
    public Music musicBeanBuilder(ClassPathXmlApplicationContext context) {
        return context.getBean("classicalMusic", Music.class);
    }
}
