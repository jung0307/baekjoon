import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userX = sc.nextInt();
        int userY = sc.nextInt();

        int N = sc.nextInt();

        int closestTaxiX = 0;
        int closestTaxiY = 0;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int taxiX = sc.nextInt();
            int taxiY = sc.nextInt();

            int distance = Math.abs(userX - taxiX) + Math.abs(userY - taxiY);

            if (distance < minDistance) {
                minDistance = distance;
                closestTaxiX = taxiX;
                closestTaxiY = taxiY;
            }
        }

        System.out.println(closestTaxiX + " " + closestTaxiY);

        sc.close();
    }
}
