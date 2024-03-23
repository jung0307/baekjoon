import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("");

        int arr[] = new int[26];

        for(int i = 0; i < n; i++) {
            if((int)s[i].charAt(0) >= 97 && (int)s[i].charAt(0) <= 122) {
                arr[(int)s[i].charAt(0) - 97]++;
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[25]);


    }
}
