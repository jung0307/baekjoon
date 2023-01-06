
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int arrInt[] = new int[n];
        int arrInt2[] = new int[n];

        for(int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(s[i]);
        }


        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = i; j < n; j++) {

                if(j != n - 1) {
                    if(arrInt[i] > arrInt[j+1]) {
                        count++;
                    }else{
                        arrInt2[i] = count;
                        break;
                    }
                }else {
                    arrInt2[i] = count;
                }

            }

        }

        int max = 0;

        for(int i = 0; i < arrInt2.length; i++) {
            if(max < arrInt2[i]) {
                max = arrInt2[i];
            }
        }

//        for(int a : arrInt) {
//            System.out.print(a+" ");
//        }
//        System.out.println();
//
//        for(int a : arrInt2) {
//            System.out.print(a+" ");
//        }
//        System.out.println();

        System.out.println(max);

    }
}
