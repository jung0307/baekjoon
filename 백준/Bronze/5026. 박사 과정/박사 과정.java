import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            if(s.contains("P=NP")) {
                sb.append("skipped\n");
            }else {
                String ss[] = s.split("\\+");
                sb.append(Integer.parseInt(ss[0]) + Integer.parseInt(ss[1]) + "\n");
            }
        }

        System.out.print(sb.toString());


    }
}
