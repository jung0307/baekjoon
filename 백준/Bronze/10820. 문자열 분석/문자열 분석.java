
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        StringBuilder sb = new StringBuilder();
        while ( (input = br.readLine()) != null ) {

            String s[] = input.split("");
            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;
            int sum4 = 0;

            // 공백은 32
            // A 65 Z 90 a 97 z 122 0 48 9 57
            for(int i = 0; i < s.length; i++) {

                if((int)s[i].charAt(0) >= 97 && (int)s[i].charAt(0) <= 122 ){
                    sum1++;
                }else if((int)s[i].charAt(0) >= 65 && (int)s[i].charAt(0) <= 90) {
                    sum2++;
                }else if((int)s[i].charAt(0) >= 48 && (int)s[i].charAt(0) <= 57) {
                    sum3++;
                }else if((int)s[i].charAt(0) == 32) {
                    sum4++;
                }

            }

            sb.append(sum1 + " " + sum2 + " "  + sum3 + " " + sum4 +"\n");
        }


        System.out.print(sb.toString());


    }
}
