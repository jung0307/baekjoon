import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        if(s.length < 2) {
            System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        }else {
            int a = Integer.parseInt(s[1]) - Integer.parseInt(s[0]);
            boolean tf = false;
            for(int i = 1; i < s.length - 1; i++) {
                if(Integer.parseInt(s[i + 1]) - Integer.parseInt(s[i]) != a) {
                    tf = true;
                    break;
                }
            }

            if(tf == false) {
                System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
            }else {
                System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
            }
        }



    }
}
