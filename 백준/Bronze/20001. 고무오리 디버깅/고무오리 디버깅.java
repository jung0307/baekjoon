import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "";
        br.readLine();
        int p = 0;

        while ( !(s1 = br.readLine()).equals("고무오리 디버깅 끝")) {
            
            if(s1.equals("문제")) {
                p++;
            } else {
                if(p == 0) {
                    p = p + 2;
                }else {
                    p--;
                }
            }
        }

        if(p == 0) {
            System.out.println("고무오리야 사랑해");
        }else {
            System.out.println("힝구");
        }

    }
}
