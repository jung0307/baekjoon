import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        if(Integer.parseInt(s[1]) == 1) {

            for(int i = 0; i < Integer.parseInt(s[0]); i++) {
                String ss[] = br.readLine().split("");

                for(int j = 0; j < ss.length; j++) {

                    if(ss[j].equals("d")) {
                        sb.append("q");
                    } else if (ss[j].equals("b")) {
                        sb.append("p");
                    } else if (ss[j].equals("q")) {
                        sb.append("d");
                    } else if (ss[j].equals("p")) {
                        sb.append("b");
                    }
                }

                sb.append("\n");
            }
        }else {
            for(int i = 0; i < Integer.parseInt(s[0]); i++) {
                String ss[] = br.readLine().split("");

                for(int j = 0; j < ss.length; j++) {
                    if(ss[j].equals("d")) {
                        sb.append("b");
                    } else if (ss[j].equals("b")) {
                        sb.append("d");
                    } else if (ss[j].equals("q")) {
                        sb.append("p");
                    } else if (ss[j].equals("p")) {
                        sb.append("q");
                    }
                }

                sb.append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
