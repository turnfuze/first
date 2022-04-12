package exeptions;

import static lessons.scaner.input.enterString;

public class LoginExeption extends Exeptions{
    public LoginExeption(String message, String title) {
        super(message, title);
    }

    public static void checkLogin(){
        System.out.println("Your login should contain: '_' ");
        String login;
        try{
            login = enterString();
            if(!login.contains("_")) {
                throw new LoginExeption("Your login is not contain needed chars", "WrongLoginException");
            }
        } catch (LoginExeption e) {
            System.out.println(e.getTitle()+ "\n" + e.getMessage());
            checkLogin();
        }
    }
}
