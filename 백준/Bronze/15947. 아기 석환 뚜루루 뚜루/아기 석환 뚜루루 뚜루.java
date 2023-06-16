

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = "baby sukhwan tururu turu" +
                " very cute tururu turu" +
                " in bed tururu turu" +
                " baby sukhwan";

        String ss[] = s.split(" ");

        int m = 0;

        if((n % 14) == 0) {
            m = 1;
        }else {
            m = (n % 14) - 1;
        }

        if(n < 43) {
         if(ss[m].equals("tururu") || ss[m].equals("turu")) {
             String a = ss[m];
             int o = (n / 14);
             for(int i = 0; i < o; i++) {
                 a = a + "ru";
             }
             System.out.println(a);
         } else {
             System.out.println(ss[m]);
         }
        } else if (n >= 43 && n < 57) {
            if(ss[m].equals("tururu")) {
                int o = (n / 14);
                System.out.println("tu+ru*"+(o + 2));
            } else if (ss[m].equals("turu")) {
                String a = ss[m];
                int o = (n / 14);
                for(int i = 0; i < o; i++) {
                    a = a + "ru";
                }
                System.out.println(a);
            } else {
                System.out.println(ss[m]);
            }
        } else {
            if(ss[m].equals("tururu")) {
                int o = (n / 14);
                System.out.println("tu+ru*"+(o + 2));
            } else if (ss[m].equals("turu")) {
                int o = (n / 14);
                System.out.println("tu+ru*"+(o + 1));
            }else {
                System.out.println(ss[m]);
            }
        }

    }
}
