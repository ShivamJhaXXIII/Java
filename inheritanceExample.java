

public class inheritanceExample {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.go();
        airplane jet = new airplane();
        jet.stop();

        jet.displaySpeed(555.0);
    }
}

class Vehicle {
    double speed;

    void go() {
        System.out.println("This vehicle is moving");
    }
    void stop() {
        System.out.println("This vehicle is stopped");
    }
    void displaySpeed(double speed) {
        this.speed = speed;
        System.out.println("The vehicles speed is: "+ speed);
    }
}

class Bicycle extends Vehicle{
    int wheels = 2;
    int pedals = 2;


}

class airplane extends Vehicle {
    int wheels = 20;
    int doors = 8;
}
