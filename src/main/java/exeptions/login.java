package exeptions;

import static exeptions.ConfirmPassword.confirmPassword;
import static exeptions.LoginExeption.checkLogin;
import static exeptions.PasswordExeption.checkPassword;

public class login {
    public static void main(String[] args) {
        boolean bool = true;
        String pass = null;
        checkLogin();
        while (bool) {
            pass = checkPassword();
            bool = confirmPassword(pass);
        }
        System.out.println("Completed");
    }
}
