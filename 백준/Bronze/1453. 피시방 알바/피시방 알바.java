
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        int arrInt[] = new int[101];
        int count = 0;

        for(int i = 0; i < s.length; i++) {
            if(arrInt[Integer.parseInt(s[i])] == 0) {
                arrInt[Integer.parseInt(s[i])] = 1;
            }else {
                count++;
            }
        }

        System.out.println(count);

    }
}
