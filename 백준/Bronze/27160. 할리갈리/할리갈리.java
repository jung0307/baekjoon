import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[4];
        String s[];

        boolean tf = false;

        for(int i = 0; i < n; i++) {
            s = br.readLine().split(" ");

            if(s[0].equals("BANANA")) {
                arr[0] = arr[0] + Integer.parseInt(s[1]);
            } else if (s[0].equals("STRAWBERRY")) {
                arr[1] = arr[1] + Integer.parseInt(s[1]);
            } else if (s[0].equals("LIME")) {
                arr[2] = arr[2] + Integer.parseInt(s[1]);
            }else {
                arr[3] = arr[3] + Integer.parseInt(s[1]);
            }
        }

        for(int i = 0; i < 4; i++) {
            if(arr[i] == 5) {
                tf = true;
                break;
            }
        }

        if(tf == true) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
