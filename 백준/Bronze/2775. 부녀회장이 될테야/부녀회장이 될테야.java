
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] result;
    static int[] temp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            result = new int[b];
            temp = new int[b];
            result[0] = 1;
            temp[0] = 1;

            solution(a , b);
            //System.out.println(temp[b-1]);
            sb.append(temp[b-1]+"\n");
            result = null;
            temp = null;
        }

        System.out.print(sb.toString());

    }

    static void solution(int a , int b) {

        if(a > 0){
            solution(a-1 , b);

            for(int i = 1; i < b; i++) {
                    temp[i] = temp[i-1] + result[i];
            }
            for(int j = 0; j < b; j++){
                result[j] = temp[j];
            }

        }else if(a == 0){
            for(int i = 0; i < b; i++) {
                result[i] = i+1;
            }
        }

    }
}
