import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String arr1[] = new String[n];
        String arr2[] = new String[n];

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            arr1[i] = br.readLine();
        }

        for(int i = 0; i < n; i++) {
            arr2[i] = br.readLine();
        }

        for(int i = 0; i < n; i++) {
            if(arr1[i].equals(arr2[i])) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
