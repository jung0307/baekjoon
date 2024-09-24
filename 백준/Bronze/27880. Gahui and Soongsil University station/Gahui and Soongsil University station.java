import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");
        String s3[] = br.readLine().split(" ");
        String s4[] = br.readLine().split(" ");

        String arr[] = {s1[0] , s2[0] , s3[0] , s4[0]};

        int a = Integer.parseInt(s1[1]);
        int b = Integer.parseInt(s2[1]);
        int c = Integer.parseInt(s3[1]);
        int d = Integer.parseInt(s4[1]);

        int arr2[] = {a , b , c , d};
        int sum = 0;

        for(int i = 0; i < 4; i++) {
            if(arr[i].equals("Es")) {
                sum = sum + 21 * arr2[i];
            }else {
                sum = sum + 17 * arr2[i];
            }
        }

        System.out.println(sum);

    }
}
