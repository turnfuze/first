package onlyJava.lessons.OOP.Rocks;

import onlyJava.lessons.OOP.Stonens;

public class Rock extends Stonens {

    public String includedMetal;


    public Rock(String name, String color, String includedMetal) {
        super(name, color);

        this.includedMetal = includedMetal;
    }

    @Override
    public String toString() {

        return String.format("Name: %s, Color: %s, SecondColor: %s, Texture: %s", name, color);
    }
}
