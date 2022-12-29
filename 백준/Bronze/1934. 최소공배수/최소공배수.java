
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int aa = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int b = 0; b < aa; b++) {
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

//        System.out.println(sn);
            sb.append(ln+"\n");
        }

        System.out.print(sb.toString());
    }
}
