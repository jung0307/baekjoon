import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(d(num));
        sc.close();
    }

    static int d(int i) {
        int cnt = 0;

        for(int j = 1; j <= i; j++) {
            String arr[] = Integer.toString(j).split("");
            if(arr.length == 1){
                cnt++;
            }else if(arr.length == 2){
                cnt++;
            }else if(arr.length == 3) {
                if( (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]))
                     ==
                    (Integer.parseInt(arr[1]) - Integer.parseInt(arr[2])) ) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}

