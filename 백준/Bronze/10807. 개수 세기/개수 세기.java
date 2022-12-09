import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String s = br.readLine();
        String v = br.readLine();
        int count = 0;

        String arr[] = s.split(" ");

        for(int i = 0; i < arr.length; i++) {

            if(v.equals(arr[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
