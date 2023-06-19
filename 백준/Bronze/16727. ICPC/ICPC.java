

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int a = Integer.parseInt(s1[0]) + Integer.parseInt(s2[1]);
        int b = Integer.parseInt(s1[1]) + Integer.parseInt(s2[0]);

        if(a > b) {
            System.out.println("Persepolis");
        } else if (a < b) {
            System.out.println("Esteghlal");
        }else {
            if(Integer.parseInt(s1[1]) < Integer.parseInt(s2[1])) {
                System.out.println("Persepolis");
            } else if (Integer.parseInt(s2[1]) < Integer.parseInt(s1[1])) {
                System.out.println("Esteghlal");
            }else {
                System.out.println("Penalty");
            }
        }

    }
}
