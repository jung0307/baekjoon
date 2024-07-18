import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        if(n == 1) {
            sb.append("0");
        }else {

            int sum = 0;

            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                String s[] = br.readLine().split(" ");
                ArrayList<Integer> arrr = new ArrayList<>();
                arrr.add(Integer.parseInt(s[0]));
                arrr.add(Integer.parseInt(s[1]));

                arr.add(arrr);
            }

            for(int i = 0; i < n - 1; i++) {

                sum = sum + Math.abs(arr.get(i + 1).get(0) - arr.get(i).get(0));
                sum = sum + Math.abs(arr.get(i + 1).get(1) - arr.get(i).get(1));
            }

            sb.append(sum);
        }

        System.out.print(sb.toString());

    }
}