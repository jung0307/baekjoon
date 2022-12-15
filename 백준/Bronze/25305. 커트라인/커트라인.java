
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        5 2
//        100 76 85 93 98

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String arr[] = s.split(" ");

        int N = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        s = br.readLine();
        arr = s.split(" ");

        int arrInt[] = new int[N];

        for(int i = 0; i < N; i++) {

            arrInt[i] = Integer.parseInt(arr[i]);

        }

        bw.write(solution(arrInt , k)+"");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int solution(int[] arrInt , int k) {

        for(int i = 0; i < arrInt.length - 1; i++){

            for(int j = 0; j < arrInt.length - 1 - i; j++) {

                if(arrInt[j] < arrInt[j+1]){
                    int temp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = temp;
                }

            }

        }

        return arrInt[k-1];
    }
}
