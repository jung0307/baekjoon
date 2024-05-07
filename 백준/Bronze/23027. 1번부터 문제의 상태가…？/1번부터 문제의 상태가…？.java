import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ss[] = s.split("");
        StringBuilder sb = new StringBuilder();

        if(s.contains("A")) {
            for(int i = 0; i < ss.length; i++) {
                if(ss[i].equals("B") || ss[i].equals("C") || ss[i].equals("D") || ss[i].equals("F")) {
                    sb.append("A");
                }else {
                    sb.append(ss[i]);
                }
            }
        } else if (s.contains("B")) {
            for(int i = 0; i < ss.length; i++) {
                if(ss[i].equals("C") || ss[i].equals("D") || ss[i].equals("F")) {
                    sb.append("B");
                }else {
                    sb.append(ss[i]);
                }
            }
        } else if (s.contains("C")) {
            for(int i = 0; i < ss.length; i++) {
                if(ss[i].equals("D") || ss[i].equals("F")) {
                    sb.append("C");
                }else {
                    sb.append(ss[i]);
                }
            }
        }else {
            for(int i = 0; i < ss.length; i++) {
                sb.append("A");
            }
        }

        System.out.print(sb.toString());

    }
}
