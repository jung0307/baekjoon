import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int arr1[] = new int[s[0].length()];
        int arr2[] = new int[s[1].length()];

        int sum1 = 0;
        int sum2 = 0;

        for(int i= 0; i < arr1.length; i++) {
            String ss[] = s[0].split("");
            arr1[i] = Integer.parseInt(ss[i]);
            sum1 = sum1 + arr1[i];
        }
        for(int i= 0; i < arr2.length; i++) {
            String ss[] = s[1].split("");
            arr2[i] = Integer.parseInt(ss[i]);
            sum2 = sum2 + arr2[i];
        }

        int weight1 = (arr1.length) * (sum1);
        int weight2 = (arr2.length) * (sum2);

        if(weight1 > weight2) {
            System.out.println("1");
        } else if (weight1 < weight2) {
            System.out.println("2");
        }else {
            System.out.println("0");
        }


    }
}
