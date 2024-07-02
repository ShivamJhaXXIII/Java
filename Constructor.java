import java.util.Random;

public class Constructor {
    public static void main(String[] args) {
        
        // Human h1 = new Human("Shivam", 20, 65.5);
        // h1.eat();
        // h1.drink();

        DiceRoller diceRoller = new DiceRoller();
        System.out.println(diceRoller.number);
    }
}

 class DiceRoller {
    Random rd;
    int number;     // Declared outside of the method therefore it is a global variable
    DiceRoller() {
        rd = new Random();
        
        roll();
    }
    void roll() { // there is one other possibility void roll(Random rd, int number)
        number = rd.nextInt(6) + 1;
        
    }
}
