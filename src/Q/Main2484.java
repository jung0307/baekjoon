package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2484 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;

        for(int i = 0; i < n; i++) {
            int[] arrInt = new int[7];

            String s[] = br.readLine().split(" ");

            for(int j = 0; j < 4; j++) {
                arrInt[Integer.parseInt(s[j])]++;
            }

            int maxSum = 0;
            int maxNum = 0;

            for(int j = 0; j < arrInt.length; j++) {
                if(arrInt[j] >= maxSum) {
                    maxSum = arrInt[j];
                    maxNum = j;
                }
            }

            if(maxSum == 4) {
                max = 50000 + 5000*maxNum;
            }else if(maxSum == 3) {
                max = 10000 + 1000*maxNum;
            } else if (maxSum == 2) {

                boolean tf = false;
                boolean tf2 = false;
                int two = 0;

                for(int j = 0; j < arrInt.length; j++) {
                    if(arrInt[j] == 1) {
                        tf = true;
                        break;
                    } else if (tf2 == true && arrInt[j] == 2) {
                         break;
                    } else if (tf2 == false && arrInt[j] == 2) {
                        tf2 = true;
                        two = j;
                    }
                }

                if(tf == false) {
                    max = 2000 + two*500 + maxNum*500;
                }else {
                    max = 1000 + maxNum*100;
                }

            }else if(maxSum == 1) {
                max = 100*maxNum;
            }

            arr.add(max);

        }

        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(arr.get(0));

    }
}
