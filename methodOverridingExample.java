public class methodOverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog();
        dog.name = "mushu";
        dog.speak();
        System.out.println(dog.name);
    }
}

class Animal {
    String name;
    void speak() {
        System.out.println("The Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog goes *bark*");
    }
}
