import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int d = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        LocalDate test = LocalDate.of(2009 , m , d);

        if(test.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Sunday");
        } else if (test.getDayOfWeek() == DayOfWeek.MONDAY) {
            System.out.println("Monday");
        } else if (test.getDayOfWeek() == DayOfWeek.TUESDAY) {
            System.out.println("Tuesday");
        } else if (test.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
            System.out.println("Wednesday");
        } else if (test.getDayOfWeek() == DayOfWeek.THURSDAY) {
            System.out.println("Thursday");
        } else if (test.getDayOfWeek() == DayOfWeek.FRIDAY) {
            System.out.println("Friday");
        } else if (test.getDayOfWeek() == DayOfWeek.SATURDAY) {
            System.out.println("Saturday");
        }

    }
}
