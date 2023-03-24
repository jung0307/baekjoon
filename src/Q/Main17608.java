package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main17608 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer arrInt[] = new Integer[n];

        for(int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(br.readLine());
        }

        int a = arrInt[arrInt.length-1];

        int sum = 0;

        for(int i = n-2; i >= 0; i--) {
            if(arrInt[i] > a) {
                sum++;
                a = arrInt[i];
            }
        }

        System.out.println(sum+1);
    }
}
