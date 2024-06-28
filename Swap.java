public class Swap {
    public static void main(String[] args) {
        int x = 123;
        int y = 245;

        // We need to swap these teo variables
        // We can take third varibale and store x in it

        int z = x;
        x = y;
        y = z;

        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }
}
