import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date date = new Date();
        long dates[]={10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L,100000000000L};

        for (int i = 0; i <dates.length ; i++) {
            date.setTime(dates[i]);
            System.out.println(date.toString());

        }
    }
}
