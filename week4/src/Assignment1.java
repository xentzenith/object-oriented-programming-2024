import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the process you desire to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int selProcess = sc.nextInt();
        switch (selProcess) {
            case 1:
                System.out.println("The addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
                break;
            case 3:
                System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not possible.");
                } else {
                    System.out.println("The division of " + num1 + " by " + num2 + " is " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid selProcess. Program terminated.");
        }

        sc.close();
    }
}
