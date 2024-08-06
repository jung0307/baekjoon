import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = "";

        while ( !(s = br.readLine()).equals("0 0 0 0") ) {

            String ss[] = s.split(" ");

            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            int c = Integer.parseInt(ss[2]);
            int d = Integer.parseInt(ss[3]);

            int cnt = 0;
            int arr[]= {a , b , c , d};

            while (true) {
                if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                    sb.append(cnt + "\n");
                    break;
                }else {
                    cnt++;
                    int A = (int)Math.abs(arr[0] - arr[1]);
                    int B = (int)Math.abs(arr[1] - arr[2]);
                    int C = (int)Math.abs(arr[2] - arr[3]);
                    int D = (int)Math.abs(arr[3] - arr[0]);

                    arr[0] = A;
                    arr[1] = B;
                    arr[2] = C;
                    arr[3] = D;
                }
            }
        }

        System.out.print(sb.toString());

    }
}
