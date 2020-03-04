

public class PasswordChecker {

    public static boolean passwordIsValid(String password)
    {

        boolean Uppercase = !password.equals(password.toLowerCase());
        boolean Lowercase = !password.equals(password.toUpperCase());
        boolean isAtLeast8 = password.length() >= 8;
        boolean hasNumber  = password.matches(".*\\d.*");
        boolean hasSpecial = !password.matches("[-~@#!$%^*)(+={}/A-Za-z0-9]*");


        if (password.isEmpty())
        {
        System.out.println("password should exist.");

        }
        if (!isAtLeast8)
        {
            System.out.println("password should be longer than 8 characters.");

        }
        if (!Lowercase)
        {
            System.out.println("password should have at least one lowercase letter");
        }
        if (!Uppercase)
        {
            System.out.println("password should have at least one uppercase letter");
        }
        if (!hasNumber)
        {
            System.out.println("password should at least have one digit");
        }
        if (!hasSpecial)
        {


        }
        else
        {
            System.out.println("Your Password: " + password + " is strong!");
        }
        return true;
    }

    public static boolean passwordIsOk(String password) {


        String word = password;
        boolean Lowercase = true;
        boolean isAtLeast8 = password.length() >= 8;


        if(password.equals(word) && Lowercase && isAtLeast8)
        {
            System.out.println("Password is Okay!");
        }
        else
        {
            System.out.println("invalid!");;
        }
        return true;
    }
}





























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































