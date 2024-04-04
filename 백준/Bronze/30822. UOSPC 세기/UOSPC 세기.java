import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int[5];
        
        String s[] = br.readLine().split("");
        
        for(int i = 0; i < n; i++) {
            if(s[i].equals("u")) {
                arr[0]++;
            } else if (s[i].equals("o")) {
                arr[1]++;
            } else if (s[i].equals("s")) {
                arr[2]++;
            } else if (s[i].equals("p")) {
                arr[3]++;
            } else if (s[i].equals("c")) {
                arr[4]++;
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[0]);
        

    }
}
