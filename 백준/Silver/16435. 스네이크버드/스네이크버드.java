import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int N = Integer.parseInt(s1[0]);
        int L = Integer.parseInt(s1[1]);

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s2[i]);
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            if(arr[i] <= L) {
                L++;
            }
        }

        System.out.println(L);

    }
}
