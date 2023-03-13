

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        ArrayList<Integer> arrInt = new ArrayList<>();

        for(int i = a; i > 0; i--) {
            if(a % i == 0) {
                arrInt.add(a/i);
            }
        }

        if(arrInt.size() < b) {
            System.out.println("0");
        }else {
            System.out.println(arrInt.get(b-1));
        }

    }
}
