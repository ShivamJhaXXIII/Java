import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExampleIndia {
    public static void main(String[] args) {
        double number = 123456.789;

        // Create a locale for India using Locale.Builder
        Locale localeIndia = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        NumberFormat currencyFormatIndia = NumberFormat.getCurrencyInstance(localeIndia);

        // Format the number as currency in the Indian locale
        System.out.println("Indian Currency: " + currencyFormatIndia.format(number));

        // Parsing a number in Indian currency format
        // try {
        //     Number parsedNumber = currencyFormatIndia.parse("₹1,23,456.79");
        //     System.out.println("Parsed Number: " + parsedNumber);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}
