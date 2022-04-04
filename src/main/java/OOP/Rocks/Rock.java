package OOP.Rocks;

import OOP.Stonens;

public class Rock extends Stonens {
    public String texture;
    public String secondColor;


    public Rock(String name, String color, String secondColor, String texture) {
        super(name, color);
        this.texture = texture;
        this.secondColor = secondColor;
    }

    @Override
    public String toString() {

        return String.format("Name: %s, Color: %s, SecondColor: %s, Texture: %s" , name, color,secondColor,texture );
    }
}
