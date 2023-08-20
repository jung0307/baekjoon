import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int arrInt[][] = new int[n][2];
        int arrInt2[][] = new int[m][2];

        int a = 0;
        int b = 0;

        int answer = 0;

        for(int i = 0; i < n; i++) {
           s = br.readLine().split(" ");

            arrInt[i][0] = Integer.parseInt(s[0]);
            arrInt[i][1] = Integer.parseInt(s[1]);

        }

        for(int i = 0; i < m; i++) {
             s = br.readLine().split(" ");

            arrInt2[i][0] = Integer.parseInt(s[0]);
            arrInt2[i][1] = Integer.parseInt(s[1]);

        }

        int m_a = arrInt[a][0];
        int m_b = arrInt2[b][0];

        for(int i = 0; i <= 100; i++) {

            if(i > m_a) {
                a++;
                m_a = m_a + arrInt[a][0];
            }
            if(i > m_b) {
                b++;
                m_b = m_b + arrInt2[b][0];
            }

            if(arrInt2[b][1] > arrInt[a][1]) {
                if(arrInt2[b][1] - arrInt[a][1] >= answer) {
                    answer = arrInt2[b][1] - arrInt[a][1];
                }
            }

        }

        System.out.println(answer);




    }
}
