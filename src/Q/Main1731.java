package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main1731 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrInt = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            arrInt.add(a);
        }

        int b = 0;

        if(arrInt.get(2) - arrInt.get(1) == arrInt.get(1) - arrInt.get(0)) {
            b = arrInt.get(2) - arrInt.get(1);
            System.out.println(arrInt.get(arrInt.size()-1) + b);
        }else {
            b = (int)arrInt.get(2) / arrInt.get(1);
            System.out.println(arrInt.get(arrInt.size()-1) * b);
        }
    }
}
