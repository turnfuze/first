package onlyJava.lessons.OOP.Minerals;

public class Korynd extends Minerals {
    private int hardness;

    public Korynd(String name, String color, int density, int hardness) {
        super(name, color, density);
        this.hardness = hardness;
    }

    public Korynd(String name, String color, int density) {
        super(name,color,density);
    }
}
