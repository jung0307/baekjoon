
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arrInt[] = new int[n];

        for(int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(br.readLine());
        }

        int max = arrInt[0];
        int count = 0;
        int maxNum = 0;

        for(int i = 1; i < n; i++) {
            if(max < arrInt[i]) {
                max = arrInt[i];
                maxNum = i;
            }
        }

        if(maxNum == 0) {
            Arrays.sort(arrInt);
            if(n == 1) {
                count = 0;
            }else if(arrInt[arrInt.length-1] == arrInt[arrInt.length-2]) {
                count++;
            }
        }else {
            while (arrInt[0] <= arrInt[maxNum]) {
                arrInt[0] = arrInt[0] + 1;
                arrInt[maxNum] = arrInt[maxNum] - 1;
                count++;

                for(int i = 1; i < arrInt.length; i++) {
                    if(arrInt[maxNum] < arrInt[i]) {
                        maxNum = i;
                        break;
                    }
                }
//
//                for(int w : arrInt) {
//                    System.out.print(w+" ");
//                }
//                System.out.println();
            }
        }

        System.out.println(count);
    }
}
