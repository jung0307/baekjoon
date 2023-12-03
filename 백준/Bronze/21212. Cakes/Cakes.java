import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            if(i == 0) {
                min = Integer.parseInt(s[1]) / Integer.parseInt(s[0]);
            }

           int tmp = Integer.parseInt(s[1]) / Integer.parseInt(s[0]);

           if(tmp <= min) {
               min = tmp;
           }
        }

        System.out.println(min);


    }
}
