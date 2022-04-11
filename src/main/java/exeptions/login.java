package exeptions;

import static lessons.scaner.input.enterString;

public class login {
    public static void main(String[] args) {
        boolean check = false;
        System.out.println("Your login should contain: a-z, '_' ");
        try{
            String login;
            login = enterString();
            if(!login.contains("_")) {
                throw new Exeptions("Your login is not contain needed chars 0", "WrongLoginException");
            }
            if (login.equals("password_")){
                throw new Exeptions("Your login is not contain needed chars 5", "WrongLoginException");
            }
        } catch (Exeptions e) {
            System.out.println(e.getTitle()+ "\n" + e.getMessage()  );

        }
    }
}
