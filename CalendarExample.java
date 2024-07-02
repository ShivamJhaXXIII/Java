import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt() - 1; // Calendar months are zero-based
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekString = "";
        
        switch(dayOfWeek) {
            case 1: dayOfWeekString = "SUNDAY"; 
            break;
            case 2: dayOfWeekString = "MONDAY";
            break;
            case 3: dayOfWeekString = "TUESDAY";
            break;
            case 4: dayOfWeekString = "WEDNESDAY";
            break;
            case 5: dayOfWeekString = "THURSDAY";
            break;
            case 6: dayOfWeekString = "FRIDAY";
            break;
            case 7: dayOfWeekString = "SATURDAY";
            break;
        }
        System.out.println(dayOfWeekString);

        
        sc.close();
    }
}
