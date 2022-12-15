
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arrInt[] = new int[n];
        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            arrInt[i] = m;
        }

        for(int i = 0; i < arrInt.length-1; i++) {

            for(int j = 0; j < arrInt.length-1-i; j++) {

                if(arrInt[j] > arrInt[j+1]) {
                    int temp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = temp;
                }

            }

        }

        for (int i : arrInt) {
            System.out.println(i);
        }


    }

}
