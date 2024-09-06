import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        long M = sc.nextLong(); 
        int[] primes = new int[N];

        for (int i = 0; i < N; i++) {
            primes[i] = sc.nextInt();
        }

        long result = 0;

        for (int i = 1; i < (1 << N); i++) {
            long lcm = 1;
            int bits = Integer.bitCount(i);

            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) != 0) {
                    lcm = lcm * primes[j] / gcd(lcm, primes[j]);
                    if (lcm > M) break;
                }
            }

            if (lcm <= M) {
                if (bits % 2 == 1) {
                    result += M / lcm;
                } else {
                    result -= M / lcm;
                }
            }
        }

        System.out.println(result);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
