public class Lab1 {
    public void task1() {
        int var1 = 16;
        int var2 = 3;

        int addition = var1 + var2;
        int subtraction = var1 - var2;
        int multiplication = var1 * var2;
        int division = var1 / var2;
        int modulus = var1 % var2;
        int increment = var1++;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
        System.out.println("Increment: " + increment);
    }

    public void task2(){

        double var1 = 16;
        double var2 = 3;
        
        double division = var1 / var2;
        double division_rounded = Math.round(division);
        double cubed = Math.pow(var1, 3);
        double square_root = Math.sqrt(var1);


        System.out.println("Division: " + division);
        System.out.println("Division rounded: " + division_rounded);
        System.out.println("Cubed: " + cubed);
        System.out.println("Square root: " + square_root);
    }


    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        lab1.task1();
        System.out.println(new String(new char[50]).replace("\0", "-"));
        lab1.task2();
    }

}
