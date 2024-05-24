import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.chooseOperation();
    }
}

class Calculator {
    Double resultSaver = 0.0;//this will hold the result of the operation
    Double firstNumber;//this will hold the first number
    Double secondNumber;//this will hold the second number

    public void chooseOperation() {//this method will display the menu and get the operation from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        String operation = scanner.nextLine();

        if (operation.equals("1")) {//this will check if the user chose '1' which is 'Add
            System.out.println("You chose Add operation.");
            add();
        } else if (operation.equals("2")) {//this will check if the user chose '2' which is 'Subtract
            System.out.println("You chose Subtract operation.");
            subtract();
        } else if (operation.equals("3")) {//this will check if the user chose '3' which is 'Multiply
            System.out.println("You chose Multiply operation.");
            multiply();
        } else if (operation.equals("4")) {//this will check if the user chose '4' which is 'Divide
            System.out.println("You chose Divide operation.");
            divide();
        } else if (operation.equals("5")) {//this will check if the user chose '5' which is 'Exit
            System.out.println("Exiting...");
            scanner.close();
            System.exit(0);
        } else {
            System.out.println("Invalid operation. Please try again.");
            chooseOperation();
        }

        displayResult();
        
    }

    public void getNumbers() {//this method will get the numbers from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextDouble();
        scanner.close();
    }

    public void add() {//this method will add the two numbers
        getNumbers();
        resultSaver = firstNumber + secondNumber;
    }

    public void subtract() {//this method will subtract the two numbers
        getNumbers();
        resultSaver = firstNumber - secondNumber;
    }

    public void multiply() {//this method will multiply the two numbers
        getNumbers();
        resultSaver = firstNumber * secondNumber;
    }

    public void divide() {//this method will divide the two numbers
        getNumbers();
        if (secondNumber == 0) {
            System.out.println("Really? You can't divide by zero.");
            resultSaver = null;
        } else {
            resultSaver = firstNumber / secondNumber;
        }
    }

    public void displayResult() {//this method will display the result
        if (resultSaver != null) {
            System.out.println("Result: " + resultSaver);
        }
    }
}
