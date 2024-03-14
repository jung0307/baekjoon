import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[1001];

        String s[] = br.readLine().split(" ");

        int max = 0;
        int a = 0;
        int b = 0;

        for(int i = 0; i < s.length; i++) {
            if(max <= Integer.parseInt(s[i])) {
                max = Integer.parseInt(s[i]);
            }
            arr[Integer.parseInt(s[i])]++;
        }

        for(int i = 0; i < max + 1; i++) {
            if(arr[i] != 0) {
                arr[i]--;
                a++;
            }
        }

        for(int i = max; i >= 0; i--) {
            if(arr[i] != 0) {
                arr[i]--;
                b++;
            }
        }

        System.out.println(a + b);


    }
}
