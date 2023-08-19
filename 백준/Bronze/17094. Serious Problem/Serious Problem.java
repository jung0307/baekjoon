import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String s[] = br.readLine().split("");

        int arrInt[] = new int[2];

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("2")) {
                arrInt[0]++;
            }else {
                arrInt[1]++;
            }
        }

        if(arrInt[0] > arrInt[1]) {
            System.out.println("2");
        } else if (arrInt[0] == arrInt[1]) {
            System.out.println("yee");
        }else {
            System.out.println("e");
        }
    }
}
