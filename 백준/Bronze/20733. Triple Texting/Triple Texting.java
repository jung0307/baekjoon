import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String a = s.substring(0 , s.length()/3);
        String b = s.substring(s.length()/3 , 2 * s.length()/3);
        String c = s.substring(2 * s.length()/3);

        if(a.equals(b) && b.equals(c)) {
            System.out.println(a);
        }else {
            if(b.equals(c)) {
                System.out.println(b);
            }else if(a.equals(c)){
                System.out.println(a);
            }else if(a.equals(b)){
                System.out.println(a);
            }
        }



    }
}
