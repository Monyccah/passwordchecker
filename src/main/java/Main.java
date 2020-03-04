import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter your password");
        Scanner input = new Scanner(System.in);
        PasswordChecker tester = new PasswordChecker();


        String password = input.nextLine();
        try {
            tester.passwordIsValid(password);
            tester.passwordIsOk(password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}