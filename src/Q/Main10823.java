package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10823 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String s = "";

        while ( (s = br.readLine()) != null ) {
            sb.append(s);
        }

        String arr[] = sb.toString().split(",");
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + Integer.parseInt(arr[i]);
        }

        System.out.println(sum);

    }
}
