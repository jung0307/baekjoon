
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 0;

        for(int i = 0; i < n; i++) {

            int arrInt[] = new int[7];
            String s[] = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            arrInt[a]++;
            arrInt[b]++;
            arrInt[c]++;

            int sum = 0;
            int d = 0;

            for(int j = 1; j < arrInt.length; j++) {
                if(arrInt[j] == 3) {
                    sum = 10000 + j * 1000;
                    break;
                }else if(arrInt[j] == 2) {
                    sum = 1000 + j * 100;
                    break;
                }else if(arrInt[j] == 1){
                    d++;
                    if(d == 3) {
                        sum = j * 100;
                        break;
                    }
                }
            }

            arrayList.add(sum);

        }

        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        max = arrayList.get(0);

        System.out.println(max);

    }
}
