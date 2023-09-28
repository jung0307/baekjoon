import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        String ss1[] = s[0].split("");
        String ss2[] = s[1].split("");

        int arrInt1[] = new int[ss1.length];
        int arrInt2[] = new int[ss2.length];

        for(int i = 0; i < ss1.length; i++) {
            arrInt1[i] = Integer.parseInt(ss1[i]);
        }
        for(int i = 0; i < ss2.length; i++) {
            arrInt2[i] = Integer.parseInt(ss2[i]);
        }

        String b = "";

        if(arrInt1.length >= arrInt2.length) {

            for(int i = 0; i < arrInt2.length; i++) {
                String a = arrInt1[arrInt1.length - arrInt2.length + i] + arrInt2[i] + "";
                sb.append(a);
            }

            for(int i = 0; i < arrInt1.length - arrInt2.length; i++) {
                b = b + arrInt1[i];
            }

        }else {

            for(int i = 0; i < arrInt1.length; i++) {
                String a = arrInt2[arrInt2.length - arrInt1.length + i] + arrInt1[i] + "";
                sb.append(a);
            }

            for(int i = 0; i < arrInt2.length - arrInt1.length; i++) {
                b = b + arrInt2[i];
            }
        }

        System.out.print(b + sb.toString());


    }
}
