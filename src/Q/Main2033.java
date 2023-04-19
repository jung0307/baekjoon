package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2033 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String arr[] = s.split("");
        int n = Integer.parseInt(s);

        StringBuilder sb = new StringBuilder();

        if(n > 10) {

            for(int i = 0; i < arr.length-1; i++) {
                if(Integer.parseInt(arr[arr.length - 1 - i]) > 4) {
                    n = n - (Integer.parseInt(arr[arr.length - 1 - i]) * (int)Math.pow(10 , i)) + ((int)Math.pow(10 , i+1));
                    s = n + "";
                    arr = s.split("");
                    //System.out.println(n + " a");
                }else {
                    n = n - (Integer.parseInt(arr[arr.length - 1 - i]) * ((int)Math.pow(10 , i)));
                    s = n + "";
                    arr = s.split("");
                    //System.out.println(n + " b");
                }
            }

            for(int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
            }

        }else {
            sb.append(n);
        }

        System.out.print(sb.toString());




    }
}
