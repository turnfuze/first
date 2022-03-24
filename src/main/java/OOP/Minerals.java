package OOP;

import java.util.Objects;

public class Minerals {
    String name;
    String color;
    int density;

    public Minerals(String name, String color, int density) {
        this.name = name;
        this.color = color;
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

    @Override
    public String toString() {

        return String.format("Name %s, Color %s, Density %n", name, color, density);
    }

        @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minerals mineral = (Minerals) o;
        return Objects.equals(name, mineral.name) && Objects.equals(color, mineral.color) && Objects.equals(density, mineral.density);
    }

}
