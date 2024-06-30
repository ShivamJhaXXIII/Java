import java.util.Scanner;
public class Inputbyuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("How old are you: ");
        int age = sc.nextInt();
        sc.nextLine(); // This line is important because after scanner read the int \n character is left therefore if we want to take another input it might cause problem
        
        System.out.println("What is your favourite show");
        String show = sc.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old"+" Your favourite Show is: "+show);
        sc.close();
    }
}
