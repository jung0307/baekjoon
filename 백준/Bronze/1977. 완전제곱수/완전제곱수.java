
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrInt = new ArrayList<>();

        int square = 1;
        int square2 = 1;

        boolean tf = false;

        while (!(square >= a && square <= b)) {
            square = square2 * square2;
            if(square >= a && square <= b) {
                break;
            }
            square2++;
            if(square2 == 10001) {
                tf = true;
                break;
            }
        }

        if(tf == false) {
            int square3 = square2;
            while (square <= b) {
                arrInt.add(square);
                square3++;
                square = square3 * square3;
            }

            int sum = 0;
            for(int i : arrInt) {
                sum = sum + i;
            }
            System.out.println(sum);
            System.out.println(arrInt.get(0));
        }else {
            System.out.println("-1");
        }
    }
}
