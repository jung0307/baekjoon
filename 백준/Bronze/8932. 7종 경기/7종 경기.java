import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double arrA[] = {9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193 };
        double arrB[] = {26.7, 75, 1.5, 42.5, 210, 3.8, 254 };
        double arrC[] = {1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88 };

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int sum = 0;

            for(int j = 0; j < s.length; j++) {
                if(arrB[j] - Double.parseDouble(s[j]) >= 0) {
                    sum = sum + (int)Math.floor(arrA[j] * ( Math.pow(arrB[j] - Double.parseDouble(s[j]) , arrC[j]) ));
                }else {
                    sum = sum + (int)Math.floor(arrA[j] * ( Math.pow( Double.parseDouble(s[j]) - arrB[j] , arrC[j]) ));
                }
            }

            sb.append(sum + " \n");
        }

        System.out.print(sb.toString());

    }
}
