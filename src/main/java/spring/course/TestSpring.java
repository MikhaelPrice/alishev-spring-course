package spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("classic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());
        context.close();
    }
}
