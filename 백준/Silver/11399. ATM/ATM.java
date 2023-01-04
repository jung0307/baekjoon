
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String s[] = br.readLine().split(" ");
//
//        Arrays.sort(s);
//
//        int arrInt[] = new int[n];
//        arrInt[0] = Integer.parseInt(s[0]);
//
//        for(int i = 1; i < arrInt.length; i++) {
//            arrInt[i] =  Integer.parseInt(s[i]) + arrInt[i-1];
//        }
//
//        int sum = 0;
//        for(int i = 0; i < arrInt.length; i++) {
//            sum = sum + arrInt[i];
//        }
//
//        System.out.println(sum);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        String s[] = br.readLine().split(" ");
//
//        Arrays.sort(s);
//
//        int prev = 0;
//        int sum = 0;
//
//        for(int i = 0; i < N; i++) {
//            sum += prev + Integer.parseInt(s[i]);
//            prev += Integer.parseInt(s[i]);
//        }
//        System.out.println(sum);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[1001];


        while (N-- > 0) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int prev = 0;
        int sum = 0;

        for (int i = 0; i < 1001; i++) {

            while (arr[i]-- > 0) {

                sum += (i + prev);
                prev += i;
            }
        }
        System.out.println(sum);

    }
}
