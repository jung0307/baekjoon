import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int arrInt[] = new int[s.length];
        int arrInt2[] = new int[s.length];

        boolean tf = false;

        for(int i = 0 ; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(s[i]);
            arrInt2[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arrInt2);

        for(int i = 0; i < arrInt.length; i++) {
            if(arrInt[i] != arrInt2[i]) {
                tf = true;
                break;
            }
        }

        if(tf == false) {
            System.out.println("Good");
        }else {
            System.out.println("Bad");
        }



    }
}
