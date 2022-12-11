import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        long c = Long.parseLong(arr[2]);

        // ex 1000 70 170 1000 + 70*n > 1700 n = 11

        int i = 0;

        if (b >= c) {
            System.out.println("-1");
        }else{
            while(true){

                if( (a + b*i) < c*i ){
                    break;
                }
                i++;

            }
            System.out.println(i);
        }

    }

}
