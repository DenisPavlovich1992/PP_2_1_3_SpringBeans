package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Application {
    static ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }
    }

    @Bean
    public static Timer getTimer() {
        return applicationContext.getBean(Timer.class);
    }

}
