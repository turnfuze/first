package exeptions;

import static exeptions.PasswordExeption.checkPassword;
import static lessons.scaner.input.enterString;

public class ConfirmPassword extends Exeptions{
    public ConfirmPassword(String message, String title) {
        super(message, title);
    }

    public static boolean confirmPassword(String password) {
        boolean bool=true;
        String pass = null;
        System.out.println("Confirm password: ");
        try {
            pass = enterString();
            bool=false;
            if (!pass.equals(password)) {
                throw new ConfirmPassword("Your password not equals to first pass", "WrongConfirmPasswordException");
            }
        } catch (ConfirmPassword e) {
            System.out.println(e.getMessage() + "\n" + e.getTitle());
        }
        return bool;
    }
}
