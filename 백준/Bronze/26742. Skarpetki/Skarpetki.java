import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("B")) {
                a++;
            }else {
                b++;
            }
        }
        
        System.out.println((a / 2) + (b / 2));
        
    }
}
