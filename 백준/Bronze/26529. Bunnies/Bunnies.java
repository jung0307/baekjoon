import java.util.Scanner;

public class Main {
    
    private static long[] fibonacci = new long[46];

    private static void calculateFibonacci() {
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i <= 45; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        calculateFibonacci();
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int months = sc.nextInt();
            System.out.println(fibonacci[months]);
        }

        sc.close();
    }
}
