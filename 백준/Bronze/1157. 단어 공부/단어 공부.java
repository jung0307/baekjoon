
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().toLowerCase(Locale.ROOT).split("");

        int intArr[] = new int[26];
//        char a = 'a';
//        System.out.println((int)a);
        for(int i = 0; i < arr.length; i++) {
            intArr[arr[i].charAt(0) - 'a'] = intArr[arr[i].charAt(0) - 'a'] + 1;
        }

        int max = intArr[0];
        int num = 0;
        for(int i = 1; i < intArr.length; i++) {
            if(max < intArr[i]) {
                max = intArr[i];
                num = i;
            }
        }

        int count = 0;
        for(int i = 0; i < intArr.length; i++) {
            if(intArr[i] == max){
                count++;
            }
        }

//        for(int f : intArr) {
//            System.out.print(f+" ");
//        }

        if(count >= 2) {
            System.out.println("?");
        }else {
            System.out.println((char)('A'+num));
        }

    }
}
