import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int arr[] = new int[10];

        for(int i = N; i <= M; i++) {
            String ss = (i + "");

            for(int j = 0; j < ss.length(); j++) {
                
                arr[(int)ss.charAt(j) - 48]++;
            }
        }

        for(int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i] + " ");
        }

        sb.append(arr[9]);

        System.out.print(sb.toString());

    }
}