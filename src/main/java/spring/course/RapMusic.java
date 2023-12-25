package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

    public RapMusic getRapMusic() {
        return new RapMusic();
    }

    @Override
    public String getSong() {
        return "99 problem";
    }

    @Override
    public Music musicBeanBuilder(ClassPathXmlApplicationContext context) {
        return context.getBean("rapMusic", Music.class);
    }
}
