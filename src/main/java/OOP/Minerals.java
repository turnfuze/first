package OOP;

public class Minerals {
        String name;
        String color;
        int density;

    public Minerals(String name, String color, int density){
        this.name = name;
        this.color = color;
        this.density = density;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        System.out.println(this.color);
        return  this.color;
    }

    public  int getDensity(){
        System.out.println(this.density);
        return this.density;
    }


}
