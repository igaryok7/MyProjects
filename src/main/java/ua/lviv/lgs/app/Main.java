package ua.lviv.lgs.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext cfg = new ClassPathXmlApplicationContext("classpath:/META-INF/beans.xml");
        cfg.close();
    }
}
