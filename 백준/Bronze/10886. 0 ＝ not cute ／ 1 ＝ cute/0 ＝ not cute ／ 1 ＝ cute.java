
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arrInt[] = new int[2];

        for(int i = 0; i < n; i++) {
            arrInt[Integer.parseInt(br.readLine())]++;
        }

        boolean tf = false;
        tf = arrInt[0] > arrInt[1] ?  false : true;

        if(tf == false) {
            System.out.println("Junhee is not cute!");
        }else {
            System.out.println("Junhee is cute!");
        }


    }
}
