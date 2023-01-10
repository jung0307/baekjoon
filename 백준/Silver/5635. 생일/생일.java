
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[][] = new String[n][4];

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split( " ");
            arr[i][0] = s[0];
            arr[i][1] = s[1];
            arr[i][2] = s[2];
            arr[i][3] = s[3];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {

                if(o1[3].equals(o2[3])) {
                    if(o1[2].equals(o2[2])) {
                        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                    }else {
                        return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                    }
                }else {
                    return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                }

            }
        });

        System.out.println(arr[arr.length-1][0]);
        System.out.println(arr[0][0]);


    }
}
