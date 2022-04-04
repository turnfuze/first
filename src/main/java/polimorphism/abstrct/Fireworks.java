package polimorphism.abstrct;

public abstract class Fireworks {
    public String color;
    public String form;
    public int size;

    public Fireworks(String color, String form, int size) {
        this.color = color;
        this.form = form;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void boom();
}
