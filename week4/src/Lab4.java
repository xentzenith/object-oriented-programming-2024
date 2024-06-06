public class Lab4 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2021, 25000.00);
        car1.setMake("Honda");
        car1.setModel("Civic");
        car1.getAllFields();

        /*ignore---- */
        String del = "-";
        del = del.repeat(30);
        System.out.println(del);
        /*ignore end---- */

        Car car2 = new Car("Porsche", "911", 2021, 100000.00);
        car2.setPrice(110000.00);
        car2.setYear(2024);
        car2.getYear();
    }
}


class Car{
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void getMake() {
        System.out.println("Make: " + make);
    }
    
    public void setMake(String make) {
        this.make = make;
    }

    public void getModel() {
        System.out.println("Model: " + model);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getYear() {
        System.out.println("Year: " + year);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getPrice() {
        System.out.println("Price: " + price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getAllFields() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
    
}
