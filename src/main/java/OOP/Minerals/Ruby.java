package OOP.Minerals;

public final class Ruby extends Korynd{
    public int hardness;

    public Ruby(String name, String color, int density, int hardness) {
        super(name, color, density,hardness);
        this.hardness=hardness;
    }

    public void light(){
        System.out.println("Ruby glows red");
    }
}
