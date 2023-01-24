
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        
        for(int i = 0; i < s.length; i++) {
            if((int)s[i].charAt(0) >= 65 && (int)s[i].charAt(0) <= 90) {
                s[i] = s[i].toLowerCase();
            }else {
                s[i] = s[i].toUpperCase();
            }
        }

        for(String a : s) {
            System.out.print(a);
        }
        System.out.println();

    }
}
