import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        
        int H = Integer.parseInt(s[0]);
        int I = Integer.parseInt(s[1]);
        int A = Integer.parseInt(s[2]);
        int R = Integer.parseInt(s[3]);
        int C = Integer.parseInt(s[4]);
        
        System.out.println(H * I - A * R * C);

    }
}
