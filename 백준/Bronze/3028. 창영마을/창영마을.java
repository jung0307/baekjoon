import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split("");
        int arrInt[] = new int[3];
        int temp;
        int answer = 0;

        arrInt[0] = 1;

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("A")) {
                temp = arrInt[0];
                arrInt[0] = arrInt[1];
                arrInt[1] = temp;
            } else if (s[i].equals("B")) {
                temp = arrInt[1];
                arrInt[1] = arrInt[2];
                arrInt[2] = temp;
            }else {
                temp = arrInt[0];
                arrInt[0] = arrInt[2];
                arrInt[2] = temp;
            }
        }

        for(int i = 0; i < 3; i++) {
            if(arrInt[i] == 1) {
                answer = i + 1;
                break;
            }
        }

        System.out.println(answer);


    }
}
