import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrInt[] = new int[10];
        int answer = 0;

        for(int i = 0; i < 5; i++) {
            arrInt[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0; i < arrInt.length; i++) {
            if(arrInt[i] % 2 == 1) {
                answer = i;
            }
        }

        System.out.println(answer);

    }
}
