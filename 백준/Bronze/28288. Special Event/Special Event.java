import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int arr[] = new int[6];

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");

            for(int j = 0; j < 5; j++) {
                if(s[j].equals("Y")) {
                    arr[j + 1]++;
                }
            }
        }

        int max = 0;

        for(int i = 1; i < 6; i++) {
            if(arr[i] >= max) {
                max = arr[i];
            }
        }

        boolean tf = false;

        for(int i = 1; i < 6; i++) {
            if(arr[i] == max) {
                if(tf == false) {
                    sb.append(i);
                    tf = true;
                }else {
                    sb.append("," + i);
                }
            }
        }

        System.out.print(sb.toString());

    }
}
