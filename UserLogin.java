import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String 
        userName = "kerem", 
        password = "1234",
        inputUName, inputPassword;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        inputUName = sc.nextLine();

        System.out.print("Enter password: ");
        inputPassword = sc.nextLine();


        if(inputUName.equals(userName) && inputPassword.equals(password)) {
            System.out.println("Login successfull");
        } else {
            System.out.print("Reset password? (y/n)");
            String select = sc.next();

            if(select.equals("y")) {
                System.out.print("Enter new password: ");
                String newPassword = sc.nextLine();

                if(newPassword.equals(password)) {
                    System.out.println("new password cannot be the same as old password");
                } else {
                    password = newPassword;
                }
            }
        }

    }
}
