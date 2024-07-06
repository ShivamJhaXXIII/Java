public class Car {

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "Blue";
    double price = 50000.00;

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

    void drive() {
        System.out.println("You are driving the car");
    }
    void brake() {
        System.out.println("You step on the brakes");
    }
}
