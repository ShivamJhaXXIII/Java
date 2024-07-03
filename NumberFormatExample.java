import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.*;

class NumberFormatExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pay = sc.nextDouble();
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(pay);
        Locale indiaLocale = new Locale.Builder().setLanguage("en").setRegion("in").build();
        //Locale indiaLocale = Locale.forLanguageTag("en-IN");
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(pay);

        india = "Rs." + india.substring(1);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(pay);
        //Locale franceLocale = new Locale.Builder().setLanguage("fr").setRegion("fr").build();
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(pay);

        System.out.println("US: "+ us);
        System.out.println("INDIA: "+ india);
        System.out.println("CHINA: "+ china);
        System.out.println("France: "+ france);

        
        
        sc.close();
    }
}