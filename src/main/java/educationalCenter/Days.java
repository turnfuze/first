package educationalCenter;

public enum Days {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday"),
    ;

    private String name;

    public String getName() {
        return name;
    }

    Days(String name) {
        this.name = name;
    }
}
