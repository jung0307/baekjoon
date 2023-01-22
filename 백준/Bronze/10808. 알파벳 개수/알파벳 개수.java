
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int arrInt[] = new int[26];

        for(int i = 0; i < s.length(); i++) {
            arrInt[(int)(s.charAt(i)-'a')] =  arrInt[(int)(s.charAt(i)-'a')] + 1;
        }

        for(int i = 0; i < arrInt.length - 1; i++) {
            System.out.print(arrInt[i] + " ");
        }

        System.out.print(arrInt[arrInt.length-1]);

    }
}
