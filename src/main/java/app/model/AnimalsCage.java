package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AnimalsCage {
    public AnimalsCage(@Qualifier("dogBean") Animal animal) {
        this.animal = animal;
    }

    @Bean
    public Timer getTimer() {
        return new Timer();
    }
    private final Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }
}
