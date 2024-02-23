import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int arr[] = new int[s.length];

            for(int j = 0; j < s.length; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }

            int sum = 0;
            int min = 0;
            boolean tf = false;

            Arrays.sort(arr);

            for(int j = 0; j < arr.length; j++) {
                if(arr[j] % 2 == 0) {
                    if(tf == false) {
                        min = arr[j];
                        tf = true;
                    }
                    sum = sum + arr[j];
                }
            }

            sb.append(sum + " " + min + "\n");
        }

        System.out.print(sb.toString());

    }
}
