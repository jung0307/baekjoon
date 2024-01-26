import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);
        int arr[] = new int[N - 1];

        String ss[] = br.readLine().split(" ");

        for(int i = 0; i < N - 1; i++)  {
            arr[i] = Integer.parseInt(ss[i]) + Integer.parseInt(ss[i + 1]);
        }

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min * X);

    }
}
