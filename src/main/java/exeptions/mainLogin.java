package exeptions;

import static lessons.scaner.input.enterString;

public class mainLogin {
    public static void main(String[] args) {

        try {
            enterLogin();
        }catch (LoginExeption e){
            System.out.println(e.getTitle()+ "\n" + e.getMessage());
        }

    }

    public static void enterLogin() throws LoginExeption {
        System.out.println("Your login should contain: '_' ");
        String login;

        login = enterString();
        if (!login.contains("_")) {
            throw new LoginExeption("Your login is not contain needed chars", "WrongLoginException");
        }
    }

    public static String enterPass() throws PasswordExeption {
        String pass = null;
        System.out.println("Password should contain: '!' and '_' and more small 20 chars");
        System.out.println("Enter your password");

        pass = enterString();
        if (!pass.contains("!") && !pass.contains("_") && (pass.length() > 20)) {
            throw new PasswordExeption("Your password not contain needed chars", "WrongPasswordException");
        }
        return pass;
    }

    public static void enterConfirmPass(String password) throws ConfirmPassword {
        String pass = null;
        System.out.println("Confirm password: ");

        pass = enterString();
        if (!pass.equals(password)) {
            throw new ConfirmPassword("Your password not equals to first pass", "WrongConfirmPasswordException");
        }

    }
}
