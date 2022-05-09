package onlyJava.lessons.exeptions;

public class mainLogin {

    public static boolean checkPassword(String pass) throws PasswordExeption {
        boolean status = false;
        if (!pass.contains("!") || !pass.contains("_") || (pass.length() > 20)) {
            throw new PasswordExeption("Your password not contain needed chars", " \n WrongPasswordException");
        }
        status = true;
        return status;
    }

    public static boolean confirmPassword(String pass, String confirmPass) throws ConfirmPassword {
        boolean status = false;

        if (!pass.equals(confirmPass)) {
            throw new ConfirmPassword("Your password not equals to first pass", " \n WrongConfirmPasswordException");
        }
        status = true;
        return status;
    }

    public static boolean checkLogin(String login) throws LoginExeption {
        boolean status = false;
            if (!login.contains("_")) {
                throw new LoginExeption("Your login is not contain needed chars", " \n WrongLoginException");
            }
            status = true;
            return status;
        }

    }


