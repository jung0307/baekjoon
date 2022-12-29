
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        ArrayList<Integer> arrInt = new ArrayList<>();

        int i = 1;

        int l = n >= m ? n : m;
        int s = n >= m ? m : n;

        while (i <= l) {

            if(l%i == 0 && s%i == 0){
                l = l/i;
                s = s/i;
                arrInt.add(i);
                i = 1;
            }
            i++;

        }

        int sn = 1;
        for(int c : arrInt) {
            sn = sn * c;
        }
        int ln = sn*l*s;

        System.out.println(sn);
        System.out.println(ln);

    }
}
