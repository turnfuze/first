package exeptions;

import static exeptions.loginSteps.checkCredentials;

public class login {
    public static void main(String[] args) {
        boolean confirmBool = false;

        try {
           confirmBool = checkCredentials();
        } catch (LoginExeption loginExeption) {
            System.out.println(loginExeption.getTitle() + " " + loginExeption.getMessage());
        } catch (PasswordExeption passwordExeption) {
            System.out.println(passwordExeption.getTitle() + " " + passwordExeption.getMessage());
        } catch (ConfirmPassword confirmPassword) {
            System.out.println(confirmPassword.getTitle() + " " + confirmPassword.getMessage());
        }

        if (confirmBool){
            System.out.println("Completed");
        }else {
            System.out.println("ERROR");
        }
    }
}