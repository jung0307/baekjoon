
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
//        char a = 'A';
//        char b = 'Z';
//        char c = 'a';
//        char d = 'z';
//        System.out.println((int)a);
//        System.out.println((int)b);
//        System.out.println((int)c);
//        System.out.println((int)d);
        char arrChar[] = new char[s.length];

        for(int i = 0; i < s.length; i++) {

            if((int)s[i].charAt(0) >= 65 && (int)s[i].charAt(0) <= 77) {
                arrChar[i] = (char)((int)s[i].charAt(0) + 13);
            }else if((int)s[i].charAt(0) >= 78 && (int)s[i].charAt(0) <= 90) {
                arrChar[i] = (char)((int)s[i].charAt(0) - 13);
            }else if((int)s[i].charAt(0) >= 97 && (int)s[i].charAt(0) <= 109) {
                arrChar[i] = (char)((int)s[i].charAt(0) + 13);
            }else if((int)s[i].charAt(0) >= 110 && (int)s[i].charAt(0) <= 122) {
                arrChar[i] = (char)((int)s[i].charAt(0) - 13);
            }else {
                arrChar[i] = s[i].charAt(0);
            }

        }

        for(char z : arrChar) {
            System.out.print(z);
        }
        System.out.println();

    }
}
