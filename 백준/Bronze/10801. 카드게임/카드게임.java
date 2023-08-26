import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        String b[] = br.readLine().split(" ");
        int arrInt[] = new int[2];

        for(int i = 0; i < 10; i++) {
            if(Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
                arrInt[0]++;
            } else if (Integer.parseInt(a[i]) < Integer.parseInt(b[i])) {
                arrInt[1]++;
            }
        }

        if(arrInt[0] > arrInt[1]) {
            System.out.println("A");
        } else if (arrInt[0] < arrInt[1]) {
            System.out.println("B");
        }else {
            System.out.println("D");
        }

    }
}
