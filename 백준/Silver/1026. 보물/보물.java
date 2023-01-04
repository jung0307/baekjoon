
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String arr1[] = br.readLine().split(" ");
        String arr2[] = br.readLine().split(" ");

        int arrInt1[] = new int[n];
        Integer arrInt2[] = new Integer[n];

        for(int i = 0; i < n; i++) {
            arrInt1[i] = Integer.parseInt(arr1[i]);
            arrInt2[i] = Integer.parseInt(arr2[i]);
        }

        Arrays.sort(arrInt1);
        Arrays.sort(arrInt2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
//
//        for(int i = 0; i < n; i++) {
//            System.out.print(arrInt1[i]);
//        }
//        System.out.println();
//        for(int i = 0; i < n; i++) {
//            System.out.print(arrInt2[i]);
//        }
//        System.out.println();
        int sum = 0;

        for(int i = 0; i < n; i++) {
             sum = sum + arrInt1[i] * arrInt2[i];
        }

        System.out.println(sum);

    }
}
