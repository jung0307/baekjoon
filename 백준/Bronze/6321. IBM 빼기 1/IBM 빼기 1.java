
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

//        System.out.println((int)'A');
//        System.out.println((int)'Z');

        for(int i = 0; i < n; i++) {

            String s[] = br.readLine().split("");
            char[] arrChar = new char[s.length];

            for(int j = 0; j < s.length; j++) {
                int a = (int)s[j].charAt(0);
                int b = 0;

                if(a == 90) {
                    b = 65;
                }else {
                    b = a + 1;
                }

                arrChar[j] = (char)b;
            }

            String c = "";

            for(int j = 0; j < arrChar.length; j++) {
                c = c + arrChar[j];
            }

            sb.append("String #"+ (i+1) +"\n");
            sb.append(c);

            if(i != n - 1) {
                sb.append("\n\n");
            }
        }

        System.out.print(sb.toString());
    }
}
