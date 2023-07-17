
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int Hong = Integer.parseInt(br.readLine());
        int HongRank = 0;

        int scoreArr[] = new int[s.length];

        for(int i = 0; i < s.length; i++) {
            scoreArr[i] = Integer.parseInt(s[i]);
        }

        for(int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i] == Hong) {
                HongRank = i + 1;
            }
        }

        if(HongRank <= 5) {
            System.out.println("A+");
        } else if (HongRank <= 15) {
            System.out.println("A0");
        } else if (HongRank <= 30) {
            System.out.println("B+");
        } else if (HongRank <= 35) {
            System.out.println("B0");
        } else if (HongRank <= 45) {
            System.out.println("C+");
        } else if (HongRank <= 48) {
            System.out.println("C0");
        } else if (HongRank <= 50) {
            System.out.println("F");
        }


    }
}
