import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int arr[] = new int[N + 1];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        for(int i = 0; i < M; i++) {
            String ss[] = br.readLine().split(" ");

            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);

            int temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;

        }

        for(int i = 1; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr[arr.length - 1]);

    }
}
