import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split(" ");

        int time_sum = 0;

        for(int i = 0; i < n; i++) {
            time_sum = time_sum + Integer.parseInt(s[i]);
        }

        if(time_sum >= time) {
            System.out.println("Padaeng_i Happy");
        }else {
            System.out.println("Padaeng_i Cry");
        }


    }
}
