
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split("");
        String s2[] = br.readLine().split("");
        ArrayList<String> arr = new ArrayList<>();

        int arrInt1[] = new int[26];
        int arrInt2[] = new int[26];

        for(int i = 0; i < s1.length; i++) {
            arrInt1[(int)(s1[i].charAt(0) - 'a')] = arrInt1[(int)(s1[i].charAt(0) - 'a')] + 1;
        }
        for(int i = 0; i < s2.length; i++) {
            arrInt2[(int)(s2[i].charAt(0) - 'a')] = arrInt2[(int)(s2[i].charAt(0) - 'a')] + 1;
        }

        int count = 0;
        for(int i = 0; i < arrInt1.length; i++) {
            if((arrInt1[i] != 0 && arrInt2[i] != 0 )) {
                if(arrInt1[i] >= arrInt2[i]) {
                    count = count + arrInt2[i];
                }else {
                    count = count + arrInt1[i];
                }
            }
        }
//        for(int q : arrInt1) {
//            System.out.print(q+" ");
//        }
//        System.out.println();
//        for(int q : arrInt2) {
//            System.out.print(q+" ");
//        }
//        System.out.println();

        //System.out.println(count);
        System.out.println(s1.length - count + s2.length - count);

    }
}
