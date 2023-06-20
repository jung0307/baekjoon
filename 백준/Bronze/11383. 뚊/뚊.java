
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");

        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);

        String[] arr1 = new String[N];

        boolean tf = false;

        for(int i = 0; i < N; i++) {
            String a[] = br.readLine().split("");
            String b = "";

            for(int j = 0; j < a.length; j++) {
                b = b + a[j] + a[j];
            }

            arr1[i] = b;
        }

        for(int i = 0; i < N; i++) {
            String c = br.readLine();

            if(!arr1[i].equals(c)) {
                tf = true;
                break;
            }
        }


        if(tf == false) {
            System.out.println("Eyfa");
        }else {
            System.out.println("Not Eyfa");
        }

    }
}
