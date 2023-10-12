import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]); // 5
            int b = Integer.parseInt(s[1]); // 4
            int sum = 0;

            int arrInt[][] = new int[a][b];

            for(int j = 0; j < a; j++) {
                String s2[] = br.readLine().split(" ");

                for(int k = 0; k < b; k++) {
                    arrInt[j][k] = Integer.parseInt(s2[k]);
                }
            }

            for(int j = 0; j < b; j++) {
                for(int k = 0; k < a; k++) {

                    if(arrInt[k][j] == 1) {

                        for(int l = k; l < a; l++) {
                            if(arrInt[l][j] == 0) {
                                sum++;
                            }
                        }

                    }

                }
            }

            sb.append(sum + "\n");
        }


        System.out.print(sb.toString());
    }
}
