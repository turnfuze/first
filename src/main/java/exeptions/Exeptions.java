package exeptions;

import java.io.IOException;

public class Exeptions extends IOException {
    private String title;

    public Exeptions(String message, String title) {
        super(message);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
