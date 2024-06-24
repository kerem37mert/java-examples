import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        int select;
        float num1, num2, result;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        num1 =sc.nextFloat();

        System.out.print("Enter second number: ");
        num2 =sc.nextFloat();

        System.out.println("Select operation: \n1)addition \n2)subtraction \n3)multiplication \n4)division");
        select = sc.nextInt();

        
        switch(select) {
            case 1:
                result =  num1 + num2;
                break;
            case 2:
                result =  num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                result = 0;
                System.out.println("error");
        }

        System.out.println(result);

    }
}