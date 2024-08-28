import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;

        int b = 0;
        int c = 0;
        int d = 0;

        int arr[] = new int[51];

        arr[1] = 1;

        //System.out.println(arr[1]);

        for(int i = 2; i <= 50; i++) {
            arr[i] = arr[i - 1] + (i - 1);
            //System.out.println(arr[i]);
        }

        for(int i = 1; i < 50; i++) {
            if(arr[i] <= n && n < arr[i + 1]) {
                a = i;
                d = arr[i];
                break;
            }
        }

        b = a;
        c = 1;

        for(int i = 1; i <= a; i++) {
            if(d - 1 + i == n) {
                System.out.println(b + " " + c);
                break;
            }else {
                b = a - i;
                c = i + 1;
            }
        }

    }
}
