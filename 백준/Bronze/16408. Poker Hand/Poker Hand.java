import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int arr[] = new int[14];

        for(int i = 0; i < s.length; i++) {
            if(s[i].charAt(0) == 'A') {
                arr[0]++;
            }
            else if (s[i].charAt(0) == '1') {
                arr[1]++;
            }
            else if (s[i].charAt(0) == '2') {
                arr[2]++;
            }
            else if (s[i].charAt(0) == '3') {
                arr[3]++;
            }
            else if (s[i].charAt(0) == '4') {
                arr[4]++;
            }
            else if (s[i].charAt(0) == '5') {
                arr[5]++;
            }
            else if (s[i].charAt(0) == '6') {
                arr[6]++;
            }
            else if (s[i].charAt(0) == '7') {
                arr[7]++;
            }
            else if (s[i].charAt(0) == '8') {
                arr[8]++;
            }
            else if (s[i].charAt(0) == '9') {
                arr[9]++;
            }
            else if (s[i].charAt(0) == 'T') {
                arr[10]++;
            }
            else if (s[i].charAt(0) == 'J') {
                arr[11]++;
            }
            else if (s[i].charAt(0) == 'Q') {
                arr[12]++;
            }
            else if (s[i].charAt(0) == 'K') {
                arr[13]++;
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1]);

    }
}
