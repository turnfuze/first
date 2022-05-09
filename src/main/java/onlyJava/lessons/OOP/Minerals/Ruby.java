package onlyJava.lessons.OOP.Minerals;

public final class Ruby extends Korynd{
    private int hardness;

    public Ruby(String name, String color, int density, int hardness) {
        super(name, color, density,hardness);
    }

    public void light(){
        System.out.println("Ruby glows red");
    }
}
