import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList can be defined as a resizable array
        // Initialization syntax includes ArrayList<wrapperclass> = new ArrayList<wrapperClass>();
        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("Biriyani");
        food.add("Kadai chicken");

        food.set(0, "Sushi");

        food.remove(2);

        // Printing elements before clearing the list
        System.out.println("Before clearing:");
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        food.clear(); // Clear the list

        // Printing elements after clearing the list
        System.out.println("After clearing:");
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i)); // This loop will not print anything as the list is empty
        }
    }
}
