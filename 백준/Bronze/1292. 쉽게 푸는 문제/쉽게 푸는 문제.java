

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int[] arrInt = new int[1001];

        int sum = 0;
        int count = 0;
        while (sum <= 1000) {
            sum = sum + count;
            count++;
        }

//        System.out.println(sum);
//        System.out.println(count);
        int a = 0;
        int b = 0;

        for(int i = 0; i < 47; i++) {

            for(int j = 0; j < i; j++) {
                if(a + j + 1 == 1001) {
                    break;
                }
                arrInt[a + j + 1] = i;
                b = a + j + 1;
            }
            a = b;
        }

//        for(int i : arrInt) {
//            System.out.println(i);
//        }

        int sum2 = 0;

        for(int i = Integer.parseInt(s[0]); i <= Integer.parseInt(s[1]); i++) {
            sum2 = sum2 + arrInt[i];
        }
        System.out.println(sum2);

    }
}
