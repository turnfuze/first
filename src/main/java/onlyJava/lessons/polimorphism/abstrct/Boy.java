package onlyJava.lessons.polimorphism.abstrct;

import onlyJava.lessons.polimorphism.interfc.Workable;

public class Boy extends Learning implements Workable {

    public Boy(String name, String subject) {
        super(name, subject);
    }

    @Override
    public void study() {
        System.out.println("I'm study");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating ");
    }

    @Override
    public void goToHome() {
        System.out.println("I'm go to home");
    }

    @Override
    public void goToStudy() {
        System.out.println("I'm go to study ");
    }

    @Override
    public void getDay() {
        System.out.println("What the day today?");
        System.out.println("Voice out of nowhere: "+" "+"getDay");
    }


    @Override
    public void boom() {
        System.out.println("Бросает петарду...");
        System.out.println("-бум-");
    }

}
