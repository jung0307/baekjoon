import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final int MAX_PRIME_INDEX = 320000;

    public static ArrayList<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] queries = new int[T];
        for (int i = 0; i < T; i++) {
            queries[i] = sc.nextInt();
        }

        ArrayList<Integer> primes = sieve(MAX_PRIME_INDEX);
        ArrayList<Integer> superPrimes = new ArrayList<>();

        for (int i = 0; i < primes.size(); i++) {
            int primePosition = i + 1;
            if (isPrime(primePosition, primes)) {
                superPrimes.add(primes.get(i));
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println(superPrimes.get(queries[i] - 1));
        }

        sc.close();
    }

    private static boolean isPrime(int num, ArrayList<Integer> primes) {
        return primes.contains(num);
    }
}
