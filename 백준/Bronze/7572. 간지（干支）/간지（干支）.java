import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) % 60;

        if(n - 4 < 0) {
            n = 56 + n;
        }else {
            n = n - 4;
        }

        String s1[] = {"0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" ,"8" ,"9"};
        String s2[] = {"A" , "B" , "C" , "D" , "E" , "F" , "G" ,"H" ,"I" , "J" , "K", "L"};
        String s3[] = new String[60];

        int cnt = 0;

        int i = 0;
        int j = 0;

        while (cnt != 60) {
            if(i == 10) {
                i = 0;
            }
            if(j == 12) {
                j = 0;
            }

            s3[cnt] = s2[j++] + s1[i++];
            cnt++;
        }

        System.out.println(s3[n]);



    }
}
