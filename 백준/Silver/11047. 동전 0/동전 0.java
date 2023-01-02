
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int m2 = m;
        int sum = 0;
        int count = 0;

        int arrInt[] = new int[n];

        for(int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(br.readLine());
        }

        while (sum != m2) {

            int a = 0;
            for(int i = 0; i < arrInt.length; i++) {
                if(arrInt[i] <= m) {
                    a = i;
                }
            }

            sum = sum + arrInt[a];
            count++;
            m = m - arrInt[a];
        }

        System.out.println(count);



    }
}
