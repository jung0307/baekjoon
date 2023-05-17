
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

        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(a);
        arrInt.add(b);
        arrInt.add(c);

        Collections.sort(arrInt);

        a = arrInt.get(0);
        b = arrInt.get(1);
        c = arrInt.get(2);

        if(a + b > c) {
            System.out.println(a + b + c);
        }else {
          System.out.println(a + b + c - ( (c) - (a + b - 1)));
        }


    }
}
