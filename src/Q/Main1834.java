package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main1834 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());

        long sum = 0;

        for(int i = 1; i <= a-1; i++) {

            sum = sum + (a * i + i);
//            System.out.println((a * i + i));
        }

        System.out.println(sum);

    }
}
