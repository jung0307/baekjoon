import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {

            String s[] = br.readLine().split("");
            int arrInt[] = new int[8];

            for(int j = 0; j < s.length - 2; j++) {
                String ss = "";

                for(int k = 0; k < 3; k++) {
                    ss = ss + s[j + k];
                }


                switch (ss) {
                    case "TTT" : arrInt[0]++; break;
                    case "TTH" : arrInt[1]++; break;
                    case "THT" : arrInt[2]++; break;
                    case "THH" : arrInt[3]++; break;
                    case "HTT" : arrInt[4]++; break;
                    case "HTH" : arrInt[5]++; break;
                    case "HHT" : arrInt[6]++; break;
                    case "HHH" : arrInt[7]++; break;

                }

            }
            sb.append(arrInt[0] + " " + arrInt[1] + " "+ arrInt[2] + " "+ arrInt[3] + " "+ arrInt[4] + " "
                    + arrInt[5] + " "+ arrInt[6] + " "+ arrInt[7] +"\n");
        }

        System.out.print(sb.toString());

    }
}
