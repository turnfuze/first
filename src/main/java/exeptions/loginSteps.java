package exeptions;

import static exeptions.mainLogin.*;
import static lessons.scaner.input.enterString;

public class loginSteps {

    public static boolean checkCredentials() throws LoginExeption, PasswordExeption, ConfirmPassword {
        String pass;
        String login;
        String confirmPass;
        boolean status;
        boolean statusLogin;
        boolean statusPass;
        boolean statusConfirmPass;

        System.out.println("Your login should contain: '_' and should be smaller 20 chars");
        System.out.println("Enter your login: ");
        login = enterString();
        statusLogin = checkLogin(login);

        System.out.println("Password should contain: '!' and '_' and more small 20 chars");
        System.out.println("Enter your password: ");
        pass = enterString();
        statusPass = checkPassword(pass);

        System.out.println("Confirm password: ");
        confirmPass = enterString();
        statusConfirmPass = confirmPassword(pass, confirmPass);

        if (statusLogin && statusPass && statusConfirmPass) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
}
