
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        if(a+b+c >= 100) {
            System.out.println("OK");
        }else {
            ArrayList<Integer> arrInt = new ArrayList<>();
            arrInt.add(a);
            arrInt.add(b);
            arrInt.add(c);

            Collections.sort(arrInt);

            if(arrInt.get(0) == a) {
                System.out.println("Soongsil");
            }else if(arrInt.get(0) == b) {
                System.out.println("Korea");
            }else {
                System.out.println("Hanyang");
            }
        }

    }
}
