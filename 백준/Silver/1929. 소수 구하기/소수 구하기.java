
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String arr[] = s.split(" ");
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        int count;

        for(int i = m; i <= n; i++){
            count = 0;

            if(i == 1){
                continue;
            }

            for(int j = 2; j <= Math.sqrt(i); j++) {

                if(i%j == 0){
                    count++;
                    break;
                }

            }
            if(count == 0){
                System.out.println(i);
            }

        }
    }

}
//1
//        10
//        13
//        100
//        1000
//        10000
//        100000
//        0
//
//1
//        4
//        3
//        21
//        135
//        1033
//        8392