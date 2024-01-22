import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String s[] = br.readLine().split("");

        int arr[] = new int[5];

//        𝐇 𝐈 𝐀 𝐑 𝐂

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("H")) {
                arr[0]++;
            } else if (s[i].equals("I")) {
                arr[1]++;
            } else if (s[i].equals("A")) {
                arr[2]++;
            } else if (s[i].equals("R")) {
                arr[3]++;
            } else if (s[i].equals("C")) {
                arr[4]++;
            }
        }

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] <= min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
