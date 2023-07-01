
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int A_A = Integer.parseInt(s1[0]);
        int A_L = Integer.parseInt(s1[1]);
        int B_A = Integer.parseInt(s2[0]);
        int B_L = Integer.parseInt(s2[1]);

        boolean arrBoo[] = {false , false};

        while (true) {

            A_L = A_L - B_A;
            B_L = B_L - A_A;

            if(A_L <= 0 && B_L > 0) {
                arrBoo[0] = true;
            } else if (A_L > 0 && B_L <= 0) {
                arrBoo[1] = true;
            } else if (A_L <= 0 && B_L <= 0) {
                arrBoo[0] = true;
                arrBoo[1] = true;
            }

            if(arrBoo[0] == true && arrBoo[1] == false) {
                System.out.println("PLAYER B");
                break;
            } else if (arrBoo[0] == false && arrBoo[1] == true) {
                System.out.println("PLAYER A");
                break;
            } else if (arrBoo[0] == true && arrBoo[1] == true) {
                System.out.println("DRAW");
                break;
            }
        }

    }
}
