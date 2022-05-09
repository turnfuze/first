package onlyJava.lessons.OOP.Rocks;

import onlyJava.lessons.OOP.Stoneable;

public final class Gematit extends Rock implements Stoneable {
    public float amount;

    public Gematit(String name, String color, String includedMetal, float amount) {
        super(name, color, includedMetal);
        this.amount = amount;
    }

    public void slice() {
        System.out.println(" Slice on squares");
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Color: %s, SecondColor: %s, Texture: %s, Surface: %s", name, color);
    }

    @Override
    public void melting(Rock rock) {
        float weight = amount * indexLossesOre;
        System.out.println("You get bulling of " + this.includedMetal + " weight: " + weight + " g");
    }
}
