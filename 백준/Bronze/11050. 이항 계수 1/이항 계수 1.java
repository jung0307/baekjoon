
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        int a = solution(n) / (solution(m) * solution(n-m));
        System.out.println(a);
    }

    static int solution(int s) {
        if(s > 0) {
            int z = solution(s-1);
            return s*z;
        }else{
            return 1;
        }
    }
}
