
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        char charArr[] = new char[36];

        for(int i = 0; i < 10; i++) {
            charArr[i] = (char) (48 + i);
        }

        for(int i = 10; i < charArr.length; i++) {
            charArr[i] = (char) (65 + i - 10);
        }

        ArrayList<Character> arr = new ArrayList<>();

        while (m != 0) {
            arr.add(charArr[m%n]);
            m = m/n;
        }

        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(arr.size() - 1 - i));
        }
        System.out.println();
    }
}
