
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++) {
            int arrInt[] = new int[10];
            String a[] = br.readLine().split("");

            int count = 0;

            for(int j = 0; j <7; j++) {
                if(a[j].equals(a[j+1])) {

                    count++;

                    if(arrInt[Integer.parseInt(a[j])] <= count) {
                        arrInt[Integer.parseInt(a[j])] = count;
                        arrInt[Integer.parseInt(a[j])]++;
                    }

                }else {
                    count = 0;
                }
            }

            Arrays.sort(arrInt);

            if(arrInt[arrInt.length-1] == 0) {
                sb.append("1\n");
            }else {
                sb.append(arrInt[arrInt.length-1]+"\n");
            }
        }

        System.out.print(sb.toString());

    }
}
