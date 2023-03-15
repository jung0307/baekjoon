package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main11948 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        for(int i = 0; i < 2; i++) {
            arr2.add(Integer.parseInt(br.readLine()));
        }

        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        arr2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        int sum1 = 0;
        int sum2 = arr2.get(0);

        for(int i = 0; i < 3; i++) {
            sum1 = sum1 + arr.get(i);
        }

        System.out.println(sum1+sum2);


    }
}
