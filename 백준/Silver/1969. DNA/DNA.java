
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String arr[] = new String[n];
        char arrChar[] = new char[m];

        for(int i = 0 ; i < n; i++) {
            arr[i] = br.readLine();
        }

        for(int i = 0; i < m; i++) {
            int[] arrInt = new int[26];

            for(int j = 0; j < n; j++) {
                char x = arr[j].charAt(i);
                arrInt[(int)(x-'A')] = arrInt[(int)(x-'A')] + 1;
            }

            int maxNum = 0;
            int max = arrInt[0];
            for(int j = 0; j < arrInt.length; j++) {
                if(arrInt[j] != 0 && max < arrInt[j]) {
                    max = arrInt[j];
                    maxNum = j;
                }
            }

            if(max > 1) {
                for(int j = 0; j < arrInt.length; j++) {
                    if(max == arrInt[j]) {
                        maxNum = j;
                        break;
                    }
                }

                arrChar[i] = (char)(maxNum + 'A');
            }else {
                arrChar[i] = (char)(maxNum + 'A');
            }

        }
        StringBuilder sb = new StringBuilder();

        for(char z : arrChar) {
            sb.append(z);
        }
        System.out.println(sb.toString());

        String resultArr[] = sb.toString().split("");

        int eSum = 0;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            String ss[] = arr[i].split("");

            for(int j = 0; j < m; j++) {
                if(!resultArr[j].equals(ss[j])) {
                    sum++;
                }
            }
            eSum = eSum + sum;
        }

        System.out.println(eSum);

    }
}
