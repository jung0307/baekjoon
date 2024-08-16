import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int c = arr[0];
        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        if(c == max) {
            System.out.println("S");
        }else {
            System.out.println("N");
        }

    }
}
