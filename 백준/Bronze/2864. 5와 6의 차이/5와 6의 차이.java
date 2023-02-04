
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int c = a;
        int d = b;

        // 5 - > 6
        char[] maxA = new char[s[0].length()];
        char[] maxB = new char[s[1].length()];

        for(int i = 0; i < s[0].length(); i++) {
            if(s[0].charAt(i) == '5') {
                maxA[i] = '6';
            }else {
                maxA[i] = s[0].charAt(i);
            }
        }

        for(int i = 0; i < s[1].length(); i++) {
            if(s[1].charAt(i) == '5') {
                maxB[i] = '6';
            }else {
                maxB[i] = s[1].charAt(i);
            }
        }

        // 6 - > 5
        char[] minA = new char[s[0].length()];
        char[] minB = new char[s[1].length()];

        for(int i = 0; i < s[0].length(); i++) {
            if(s[0].charAt(i) == '6') {
                minA[i] = '5';
            }else {
                minA[i] = s[0].charAt(i);
            }
        }

        for(int i = 0; i < s[1].length(); i++) {
            if(s[1].charAt(i) == '6') {
                minB[i] = '5';
            }else {
                minB[i] = s[1].charAt(i);
            }
        }

        String maxSA = String.valueOf(maxA);
        String maxSB = String.valueOf(maxB);
        String minSA = String.valueOf(minA);
        String minSB = String.valueOf(minB);

        int max = Integer.parseInt(maxSA) + Integer.parseInt(maxSB);
        int min = Integer.parseInt(minSA) + Integer.parseInt(minSB);

        System.out.println(min + " " + max);
    }
}
