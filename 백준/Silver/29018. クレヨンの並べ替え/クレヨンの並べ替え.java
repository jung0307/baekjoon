import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("#") ) {
            String aa[] = s.split("");

            Arrays.sort(aa, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.charAt(0) > o2.charAt(0)) {
                        return 1;
                    } else if (o1.charAt(0) == o2.charAt(0)) {
                        return 0;
                    }else {
                        return -1;
                    }
                }
            });

            String a1 = "";
            String a2 = "";
            String a3 = "";

            for(int i = 0; i < aa.length; i++) {

                if(aa[i].charAt(0) <= 57 && aa[i].charAt(0) >= 48) {
                    a1 = a1 + aa[i];
                } else if (aa[i].charAt(0) <= 90 && aa[i].charAt(0) >= 65) {
                    a2 = a2 + aa[i];
                }else {
                    a3 = a3 + aa[i];
                }
            }

            sb.append(a3 + a2 + a1 + "\n");
        }


        System.out.print(sb.toString());
    }
}
