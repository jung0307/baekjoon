import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        long result = fibonacciSquareSum(n);
        System.out.println(result);
    }

    public static long fibonacciSquareSum(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[][] result = {{1, 1}, {1, 0}};
        matrixPower(result, n);  

        long fn = result[0][1];
        long fn1 = result[0][0];
        return (fn * fn1) % MOD;
    }

    public static void matrixPower(long[][] matrix, long n) {
        long[][] base = {{1, 1}, {1, 0}};
        long[][] result = {{1, 0}, {0, 1}}; 

        while (n > 0) {
            if (n % 2 == 1) {
                multiplyMatrix(result, base);
            }
            multiplyMatrix(base, base);
            n /= 2;
        }

        matrix[0][0] = result[0][0];
        matrix[0][1] = result[0][1];
        matrix[1][0] = result[1][0];
        matrix[1][1] = result[1][1];
    }

    public static void multiplyMatrix(long[][] a, long[][] b) {
        long x = (a[0][0] * b[0][0] + a[0][1] * b[1][0]) % MOD;
        long y = (a[0][0] * b[0][1] + a[0][1] * b[1][1]) % MOD;
        long z = (a[1][0] * b[0][0] + a[1][1] * b[1][0]) % MOD;
        long w = (a[1][0] * b[0][1] + a[1][1] * b[1][1]) % MOD;

        a[0][0] = x;
        a[0][1] = y;
        a[1][0] = z;
        a[1][1] = w;
    }
}