package onlyJava.lessons.OOP.Minerals;

public final class Sapphire extends Korynd {
    public Sapphire(String name, String color, int density, int hardness) {
        super(name, color, density,hardness);
    }

    public void light(){
        System.out.println("Sapphire glows blue");
    }
}
