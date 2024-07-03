
import java.util.Scanner;

public class strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        int lenSum = first.length() + second.length();
        System.out.println(lenSum);
        if(first.compareTo(second) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Capitalize the first letter of each string and concatenate them
        String capitalizedFirst = first.substring(0, 1).toUpperCase() + first.substring(1);
        String capitalizedSecond = second.substring(0, 1).toUpperCase() + second.substring(1);
        System.out.println(capitalizedFirst + " " + capitalizedSecond);
        sc.close();
    }
}
