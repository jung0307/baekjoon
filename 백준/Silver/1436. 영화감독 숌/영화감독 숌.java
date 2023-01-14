
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        long doom = 666;

        while (count < n) {

            if(Long.toString(doom).contains("666")) {
                count++;
            }
            doom++;

        }


        System.out.println(doom-1);


    }
}
