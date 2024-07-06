import java.sql.SQLOutput;

public class STATIC1 {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        // The class owns the static member

        Friend first = new Friend("Devrup");
        Friend second = new Friend("Evan");

        Friend.displayFriends();
    }

}

class Friend {
    String name;
    static int noOfFriends;// This is the common variable for all the instances of the class
    Friend(String name) {
        this.name = name;
        noOfFriends++;
    }
    static void displayFriends() {
        System.out.println("You have "+noOfFriends+ " friends");
    }
}
