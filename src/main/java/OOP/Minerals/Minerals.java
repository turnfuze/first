package OOP.Minerals;

import OOP.Stonens;
import polimorphism.interfc.Workable;

import java.util.Objects;

import static lessons.scaner.input.*;

public class Minerals extends Stonens{

    public int density;

    public Minerals(String name, String color, int density) {
        super(name, color);
        this.density = density;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        System.out.println(this.color);
        return this.color;
    }

    public int getDensity() {
        System.out.println(this.density);
        return this.density;
    }

    public Minerals raise() {
        System.out.println("You raised a stone, describe it ");
        System.out.println("Enter name: ");
        String name = enterString();
        System.out.println("Enter color: ");
        String color = enterString();
        System.out.println("Enter density: ");
        int density = enterNumber();
        Minerals minerals = new Minerals(name, color, density);
        return minerals;
    }


    @Override
    public String toString() {
        return String.format("Name: %s, Color: %s, Density: %n", name, color, density);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minerals mineral = (Minerals) o;
        return Objects.equals(name, mineral.name) && Objects.equals(color, mineral.color) && Objects.equals(density, mineral.density);
    }
}
