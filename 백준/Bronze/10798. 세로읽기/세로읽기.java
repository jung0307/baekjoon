
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[5];
        String[] arr1 = new String[15];
        String[] arr2 = new String[15];
        String[] arr3 = new String[15];
        String[] arr4 = new String[15];
        String[] arr5 = new String[15];

        for(int i = 0; i < 5; i++) {
            s[i] = br.readLine();
        }

        for(int i = 0; i < s[0].length(); i++) {
            String arr11[] = s[0].split("");
            int j = 0;
            for(j = 0; j < arr11.length; j++) {
                arr1[j] = arr11[j];
            }
            for(j = j; j < 15; j++) {
                arr1[j] = "";
            }
        }
        for(int i = 0; i < s[1].length(); i++) {
            String arr22[] = s[1].split("");
            int j = 0;
            for(j = 0; j < arr22.length; j++) {
                arr2[j] = arr22[j];
            }
            for(j = j; j < 15; j++) {
                arr2[j] = "";
            }
        }
        for(int i = 0; i < s[2].length(); i++) {
            String arr33[] = s[2].split("");
            int j = 0;
            for(j = 0; j < arr33.length; j++) {
                arr3[j] = arr33[j];
            }
            for(j = j; j < 15; j++) {
                arr3[j] = "";
            }
        }
        for(int i = 0; i < s[3].length(); i++) {
            String arr44[] = s[3].split("");
            int j = 0;
            for(j = 0; j < arr44.length; j++) {
                arr4[j] = arr44[j];
            }
            for(j = j; j < 15; j++) {
                arr4[j] = "";
            }
        }
        for(int i = 0; i < s[4].length(); i++) {
            String arr55[] = s[4].split("");
            int j = 0;
            for(j = 0; j < arr55.length; j++) {
                arr5[j] = arr55[j];
            }
            for(j = j; j < 15; j++) {
                arr5[j] = "";
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 15; i++) {
            sb.append(arr1[i]+arr2[i]+arr3[i]+arr4[i]+arr5[i]);
        }
        System.out.print(sb.toString());

    }
}
