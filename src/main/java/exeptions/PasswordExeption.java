package exeptions;

import static lessons.scaner.input.enterString;

public class PasswordExeption extends Exeptions {
    public PasswordExeption(String message, String title) {
        super(message, title);
    }

    public static String checkPassword() {
        String pass = null;
        System.out.println("Password should contain: '!' and '_' and more small 20 chars");
        System.out.println("Enter your password");
        try {
            pass = enterString();
            if (!pass.contains("!") || !pass.contains("_") || (pass.length() > 20)) {
                throw new PasswordExeption("Your password not contain needed chars", "WrongPasswordException");
            }
        } catch (PasswordExeption e) {
            System.out.println(e.getMessage() + "\n" + e.getTitle());
            checkPassword();
        }
        return pass;
    }
}
