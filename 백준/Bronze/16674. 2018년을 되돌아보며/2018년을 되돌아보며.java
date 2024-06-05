import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        int arr[] = new int[5];

        for(int i = 0; i < s.length; i++) {
            if(Integer.parseInt(s[i]) == 2) {
                arr[0]++;
            } else if (Integer.parseInt(s[i]) == 0) {
                arr[1]++;
            } else if (Integer.parseInt(s[i]) == 1) {
                arr[2]++;
            } else if (Integer.parseInt(s[i]) == 8) {
                arr[3]++;
            }else {
                arr[4]++;
            }
        }

        if(arr[4] >= 1) {
            System.out.println(0);
        }else {

            boolean tf = false;

            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] == 0) {
                    tf = true;
                    break;
                }
            }

            if(tf == true) {
                System.out.println("1");
            }else {

                if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                    System.out.println("8");
                }else {
                    System.out.println("2");
                }

            }

        }



    }
}
