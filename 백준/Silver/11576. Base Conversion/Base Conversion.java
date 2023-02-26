
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        String s2[] = br.readLine().split(" ");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);

        int sum10 = 0;

        for(int i = 0; i < s2.length; i++) {
            sum10 = sum10 + Integer.parseInt(s2[s2.length - 1 - i]) * (int)Math.pow(a , i);
        }

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            if(sum10 == 0) {
                break;
            }

            arr.add(sum10%b);
            sum10 = sum10/b;

        }


        for (int i = arr.size()-1; i > 0; i--) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.print(arr.get(0));

    }
}
