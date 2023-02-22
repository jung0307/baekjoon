
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arrChar = new char[16];
        int sum = 0;

        for(int i = 0; i < 10; i++) {
            arrChar[i] = (char)(48 + i);
        }

        for(int i = 10; i < 16; i++) {
            arrChar[i] = (char) (65+i-10);
        }

        for(int i = 0; i < s.length(); i++) {

            for(int j = 0; j < arrChar.length; j++) {
                if(arrChar[j] == s.charAt(s.length() - 1 - i)) {
                    sum = sum + (int)Math.pow(16 , i) * j;
                }
            }

        }

        System.out.println(sum);

    }
}
