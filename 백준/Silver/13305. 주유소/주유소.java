
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        long arrInt1[] = new long[s1.length];
        long arrInt2[] = new long[s1.length];

        for(int i = 0; i < arrInt1.length; i++) {
            arrInt1[i] = Long.parseLong(s1[i]);
            arrInt2[i] = Long.parseLong(s2[i]);
//
//            System.out.println(arrInt1[i]);
//            System.out.println("-----");
//            System.out.println(arrInt2[i]);
        }
        int a = 0;
        long min = arrInt2[0];
        long sum = 0L;
        int b = 1;


        while (b <= arrInt1.length-1) {
//            System.out.println("b = " + b);
//            System.out.println("arrInt1.length-1 = " + (arrInt1.length-1));
//            System.out.println("a = " + a);

            if(arrInt2[b] <= min) {
                min = arrInt2[b];
                long msum = 0L;
                for(int j = a; j < b; j++) {
                    msum = msum + arrInt1[j];
                }
//                System.out.println("min = " + min );
//                System.out.println("msum = " + msum);
//                System.out.println("arrInt2[a] = " + arrInt2[a]);
                sum = sum + arrInt2[a] * msum;
                a = b;
            }

            if(b == arrInt1.length - 1) {
                long msum = 0;
                for(int j = a; j <= b; j++) {
                    msum = msum + arrInt1[j];
                }
//                System.out.println("msum = " + msum);
//                System.out.println("arrInt2[a] = " + arrInt2[a]);
                sum = sum + arrInt2[a] * msum;
            }

            b++;

        }

        System.out.println(sum);



    }
}
