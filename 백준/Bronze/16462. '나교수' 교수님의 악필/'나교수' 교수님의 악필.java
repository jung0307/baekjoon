import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            String ss[] = s.split("");

            if(s.equals("100")) {
                sum = sum + 100;
            }else {
                String sss = "";
                for(int j = 0; j < ss.length; j++) {
                    if(ss[j].equals("0")) {
                        sss = sss + "9";
                    } else if (ss[j].equals("6")) {
                        sss = sss + "9";
                    }else {
                        sss = sss + ss[j];
                    }
                }
                sum = sum + Integer.parseInt(sss);
            }
        }

        System.out.println((int)Math.round((double)sum/n));


    }
}
