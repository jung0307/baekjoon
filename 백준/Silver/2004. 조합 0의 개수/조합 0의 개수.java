
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        long n = Long.parseLong(s[0]);
        long m = Long.parseLong(s[1]);

        long a = 0;
        long b = 0;

//        for(long i = m+1; i <= n; i++) {
//            long z = i;
//            while (z%2 == 0 || z%5 == 0) {
//                if(z%2 == 0) {
//                    z = z/2;
//                    a++;
//                }
//                else
//                    if(z%5 == 0) {
//                    z = z/5;
//                    b++;
//                }
//            }
//        }


//        for(long i = 1; i <= n-m; i++) {
//            long z = i;
//            while (z%2 == 0 || z%5 == 0) {
//                if(z%2 == 0) {
//                    z = z/2;
//                    c++;
//                }else
//                    if(z%5 == 0) {
//                    z = z/5;
//                    d++;
//                }
//            }
//        }

        a = solution1(n) - solution1(n-m) - solution1(m);
        b = solution2(n) - solution2(n-m) - solution2(m);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println();


//        if(a - c > 0 && b - d > 0) {
//            if(a - c >= b - d) {
//                System.out.println(b-d);
//            }else {
//                System.out.println(a-c);
//            }
//        }else {
//            System.out.println(0);
//        }

        if(a <= b) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }


    }

    static long solution1(long z) {

        long x = 0;

        while (z >= 5) {
            x = x + z/5;
            z = z/5;
        }
        return x;
    }
    static long solution2(long z) {

        long x = 0;

        while (z >= 2) {
            x = x + z/2;
            z = z/2;
        }
        return x;
    }
}
