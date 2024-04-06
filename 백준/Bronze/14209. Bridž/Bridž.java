import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int[5];
        
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");
            
            for(int j = 0; j < s.length; j++) {
                if(s[j].equals("A")) {
                    arr[4]++;
                } else if (s[j].equals("K")) {
                    arr[3]++;
                } else if (s[j].equals("Q")) {
                    arr[2]++;
                } else if (s[j].equals("J")) {
                    arr[1]++;
                }
            }
        }

        for(int i = 1; i < arr.length; i++) {
            sum = sum + i * arr[i];
        }

        System.out.println(sum);
    }
}
