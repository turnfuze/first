package OOP.Rocks;

public final class Granit extends Rock {
    public String surface;

    public Granit(String name, String color, String secondColor, String texture,String surface) {
        super(name, color, secondColor, texture);
        this.surface = surface;
    }
    public void slice(){
        System.out.println(" Slice on squares");
    }

    public void polish(){
        System.out.println("Polishes to a mirror finish");
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Color: %s, SecondColor: %s, Texture: %s, Surface: %s" , name, color,secondColor,texture,surface );
    }
}
