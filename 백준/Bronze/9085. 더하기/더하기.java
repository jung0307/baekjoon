import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tries;
        tries = sc.nextInt();

        for (int i = 0; i < tries; i++) {
            int a = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < a; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }

    }
}