import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("#") ) {

//            -는 0에 대응한다.
//            \는 1에 대응한다.
//            (는 2에 대응한다.
//            @는 3에 대응한다.
//            ?는 4에 대응한다.
//            >는 5에 대응한다.
//            &는 6에 대응한다.
//            %는 7에 대응한다.
//            /는 -1에 대응한다.

            String ss[] = s.split("");

            int sum = 0;
            int arrInt[] = new int[ss.length];

            for(int i = 0; i < ss.length; i++) {
                switch (ss[i]) {
                    case "-" : arrInt[i] = 0;
                    break;
                    case "\\" : arrInt[i] = 1;
                    break;
                    case "(" : arrInt[i] = 2;
                    break;
                    case "@" : arrInt[i] = 3;
                    break;
                    case "?" : arrInt[i] = 4;
                    break;
                    case ">" : arrInt[i] = 5;
                    break;
                    case "&" : arrInt[i] = 6;
                    break;
                    case "%" : arrInt[i] = 7;
                    break;
                    case "/" : arrInt[i] = -1;
                    break;
                }
            }


            for(int i = 0; i < arrInt.length; i++) {
                sum = sum + arrInt[arrInt.length - 1 - i] * (int)Math.pow(8 , i);
            }

            sb.append(sum + "\n");

        }

        System.out.print(sb.toString());

    }
}
