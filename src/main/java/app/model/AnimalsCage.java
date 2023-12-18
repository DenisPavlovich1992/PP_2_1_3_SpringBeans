package app.model;

import app.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dogBean")
    private Animal animal;

    public Timer getTimer() {
        return Application.getTimer();
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(Application.getTimer().getTime());
        System.out.println("________________________");
    }
}
