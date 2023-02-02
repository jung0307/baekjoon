
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //System.out.println((int)'1');
       //System.out.println((int)Math.pow(2,0));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        char charArr[] = new char[36];
        for(int i = 0; i < 10; i++) {
            charArr[i] = (char) (48+i);
        }
        for(int i = 10; i < charArr.length; i++) {
            charArr[i] = (char) (65+(i-10));
        }

//        for(char a : charArr) {
//            System.out.println(a);
//        }

        int n = Integer.parseInt(s[1]);
        int sum = 0;

        for(int i = 0; i < s[0].length(); i++) {
            int index = 0;
            for(int j = 0; j < charArr.length; j++) {
                if(s[0].charAt(s[0].length()-i-1) == charArr[j]) {
                    index = j;
                }
            }
            sum = sum + (index) * (int)Math.pow(n , i);
        }

        System.out.println(sum);

    }
}
