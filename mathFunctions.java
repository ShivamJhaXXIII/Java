public class mathFunctions {
    public static void main(String[] args) {
        //The Math.max(x,y) method can be used to find the highest value of x and y: vce versa Math.min
        //The Math.sqrt(x) method returns the square root of x:

        // To caluclate hypotenuse using math fuctions in java
        double p = 3.0;
        double b = 4.0;

        double h = Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse: "+h);
    }
}
