import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length; i++) {

           String a[] = ((int)s[i].charAt(0) + "").split("") ;

           int b = 0;

           for(int j = 0; j < a.length; j++) {
               b = b + Integer.parseInt(a[j]);
           }

           for(int j = 0; j < b; j++) {
               sb.append(s[i]);
           }

           sb.append("\n");

        }

        System.out.print(sb.toString());

    }
}
