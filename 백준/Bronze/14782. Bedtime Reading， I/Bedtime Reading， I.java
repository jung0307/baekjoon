import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 1;

        while (i <= n) {
            if(n % i == 0) {
                arr.add(i);
            }
            i++;
        }

        int sum = 0;

        for(int j = 0; j < arr.size(); j++) {
            sum = sum + arr.get(j);
        }

        System.out.println(sum);

    }
}
