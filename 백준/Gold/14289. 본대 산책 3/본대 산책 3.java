import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] adj = new int[n][n];

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        long D = scanner.nextLong();

        int[][] result = matrixPower(adj, D, n);

        System.out.println(result[0][0]);
        scanner.close();
    }

    private static int[][] matrixPower(int[][] base, long exp, int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = matrixMultiply(result, base, size);
            }
            base = matrixMultiply(base, base, size);
            exp >>= 1;
        }

        return result;
    }

    private static int[][] matrixMultiply(int[][] a, int[][] b, int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                long sum = 0;
                for (int k = 0; k < size; k++) {
                    sum += (long) a[i][k] * b[k][j];
                    sum %= MOD;
                }
                result[i][j] = (int) sum;
            }
        }
        return result;
    }
}