
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(Integer.parseInt(arr[i]) == a) {
                count++;
            }
        }

        System.out.println(count);

    }
}
