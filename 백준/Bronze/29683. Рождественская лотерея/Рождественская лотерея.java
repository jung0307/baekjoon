import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A = sc.nextInt();

        int totalTickets = 0;

        for (int i = 0; i < n; i++) {
            int purchase = sc.nextInt();
            totalTickets += purchase / A;
        }

        System.out.println(totalTickets);

        sc.close();
    }
}