package OOP;

public abstract class Stonens {
    public String name;
    public String color;

    public Stonens(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void throwStone(){
        System.out.println(name + " is flying");
    }

}
