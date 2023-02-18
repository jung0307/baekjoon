
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrInt = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n %2 == 1) {
                arrInt.add(n);
                sum = sum + n;
            }
        }
        arrInt.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        if(arrInt.size() != 0) {
            System.out.println(sum);
            System.out.println(arrInt.get(0));
        }else {
            System.out.println("-1");
        }

    }
}
