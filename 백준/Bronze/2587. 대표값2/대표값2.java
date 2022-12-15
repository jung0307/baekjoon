
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrInt = new int[5];

        for(int i = 0; i < 5; i++) {

            int n = Integer.parseInt(br.readLine());
            arrInt[i] = n;

        }
        arrInt = sort(arrInt);

        System.out.println(avg(arrInt));
        System.out.println(arrInt[2]);

    }

    public static int[] sort(int[] arrInt) {

        for(int i = 0; i < arrInt.length - 1 ; i ++) {

            for(int j = 0; j < arrInt.length - 1 - i; j++) {

                if(arrInt[j] > arrInt[j+1]) {
                    int temp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = temp;
                }

            }

        }
        return arrInt;
    }

    public static int avg(int[] arrInt) {

        int avg = arrInt[0];
        int sum = 0;
        for(int i = 0; i < arrInt.length; i++) {
            sum = sum + arrInt[i];
        }
        return sum/arrInt.length;
    }

}
