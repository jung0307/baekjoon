
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lengths = new int[5];
        for (int i = 0; i < 5; i++) {
            lengths[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    if (isValidTriangle(lengths[i], lengths[j], lengths[k])) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}