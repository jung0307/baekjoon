import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int mel = 0;

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        max = max + (Integer.parseInt(s1[0]) * 3) +  (Integer.parseInt(s1[1]) * 20) + (Integer.parseInt(s1[2]) * 120);
        mel = mel + (Integer.parseInt(s2[0]) * 3) +  (Integer.parseInt(s2[1]) * 20) + (Integer.parseInt(s2[2]) * 120);

        if(max > mel) {
            System.out.println("Max");
        } else if (max < mel) {
            System.out.println("Mel");
        }else {
            System.out.println("Draw");
        }

    }
}
