public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void eat() {
        System.out.println(name + " Eats apple");
    }
    void drink() {
        System.out.println(name +" must be 21 to be allowed to drink, But  his age is "+age);
    }
}
