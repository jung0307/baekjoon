import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int conferenceHour = scanner.nextInt();
        int conferenceMinute = scanner.nextInt();
        int registrationTime = scanner.nextInt();
        int travelHour = scanner.nextInt();
        int travelMinute = scanner.nextInt();
        int studentCount = scanner.nextInt() + 1;
        int accommodationTimePerStudent = scanner.nextInt();

        int totalAccommodationTime = studentCount * accommodationTimePerStudent;
        int totalTravelTime = travelHour * 60 + travelMinute;
        int totalTimeNeeded = registrationTime + totalAccommodationTime + totalTravelTime + 10; // 10분 추가

        int conferenceTimeInMinutes = conferenceHour * 60 + conferenceMinute;

        int departureTimeInMinutes = conferenceTimeInMinutes - totalTimeNeeded;

        int departureHour = departureTimeInMinutes / 60;
        int departureMinute = departureTimeInMinutes % 60;

        System.out.printf("%02d %02d\n", departureHour, departureMinute);
    }
}