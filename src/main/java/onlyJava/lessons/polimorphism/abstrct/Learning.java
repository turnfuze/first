package onlyJava.lessons.polimorphism.abstrct;

public abstract class Learning {
    public String name;
    public String subject;

    public Learning(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    abstract void study();
    abstract void eat();
    abstract void goToHome();
    abstract void goToStudy();
    abstract void getDay();
}
