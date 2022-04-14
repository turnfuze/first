package exeptions;

import static lessons.scaner.input.enterString;

public class LoginExeption extends Exeptions{
    public LoginExeption(String message, String title) {
        super(message, title);
    }
}