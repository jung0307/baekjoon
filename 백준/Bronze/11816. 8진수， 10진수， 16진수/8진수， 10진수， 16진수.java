import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2[] = s1.split("");

        String a = s2[0];
        String b = s2[1];

        if(a.equals("0")) {
            if(b.equals("x") ) {
                System.out.println(Integer.parseInt(s1.substring(2) , 16));
            }else {
                System.out.println(Integer.parseInt(s1.substring(1) , 8));
            }
        }else {
            System.out.println(s1);
        }

    }
}
