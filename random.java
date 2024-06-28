import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rd = new Random();
        // generating random no. on the dice
        int x = rd.nextInt(6)+1;// Computer starts from 0, so in case we pass 6 it will output 0-5 thus we added 1 at last

        System.out.println(x);
    }
}
