import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH )+ 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

       calendar.setTimeInMillis(1234567898765L);
        year=calendar.get(GregorianCalendar.YEAR);
        month=calendar.get(GregorianCalendar.MONTH )+ 1;
        day=calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(" corresponding to this time 1234567898765L :");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

    }
}
