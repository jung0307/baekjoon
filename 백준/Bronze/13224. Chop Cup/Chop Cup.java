import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        int arr[] = {1 , 0 , 0};
        int temp = 0;

        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("A")) {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            } else if (s[i].equals("B")) {
                temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            }else {
                temp = arr[2];
                arr[2] = arr[0];
                arr[0] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                System.out.println(i + 1);
            }
        }

    }
}
