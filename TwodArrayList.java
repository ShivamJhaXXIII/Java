import java.util.ArrayList;

public class TwodArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Potatoes");
        produceList.add("Eggs");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Red Bull");
        drinks.add("Whisky");
        drinks.add("Vodka");

        groceryList.add(produceList);
        groceryList.add(bakeryList);
        groceryList.add(drinks);

        System.out.println(groceryList);
    }
}
