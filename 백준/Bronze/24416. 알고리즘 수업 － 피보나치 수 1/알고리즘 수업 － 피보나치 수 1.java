
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static int arr[] = new int[10000000];
    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

//        System.out.println(fib(n));
//        System.out.println(fibonacci(n));
        fib(n);
        fibonacci(n);
        System.out.println(count1);
        System.out.println(count2);

    }

    static int fib(int n) {

        if(n == 1 || n == 2) {
            count1++;
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    static int fibonacci(int n) {

        arr[1] = 1;
        arr[2] = 1;

        for(int i = 3; i <= n; i++) {
            count2++;
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }


}
