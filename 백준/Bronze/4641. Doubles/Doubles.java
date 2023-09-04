import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = "";

        while ( !(s = br.readLine()).equals("-1") ) {
            String ss[] = s.split(" ");

            int arrInt[] = new int[ss.length - 1];
            int cnt = 0;

            for(int i = 0; i < arrInt.length; i++) {
                arrInt[i] = Integer.parseInt(ss[i]);
            }

            Arrays.sort(arrInt);

            for (int i = 0; i < arrInt.length; i++) {
                for(int j = i; j < arrInt.length; j++) {
                    if(arrInt[i] * 2 == arrInt[j]) {
                        cnt++;
                        break;
                    }
                }
            }

            sb.append(cnt + "\n");
        }

        System.out.print(sb.toString());


    }
}
