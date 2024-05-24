public class Lab3 {
    public static void main(String[] args) {
        MethodLab methodLab = new MethodLab();
        methodLab.sayHello();
        System.out.println(methodLab.calculateSum(233, 5));
        System.out.println(methodLab.isEven(234244));
        System.out.println(methodLab.isEven(4355));
    }
}


class MethodLab{
    public void sayHello(){
        System.out.println("Hello, world!");
    }

    public int calculateSum(int a, int b){
        return a+b;
    }

    public boolean isEven(int num){
        return num%2 == 0;
    }
}