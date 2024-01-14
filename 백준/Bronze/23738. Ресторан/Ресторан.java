import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        StringBuilder sb = new StringBuilder();


//        ‘В’는 ‘B’처럼 보이지만 ‘v’로 읽는다.
//        ‘Е’는 ‘E’처럼 보이지만 ‘ye’로 읽는다.
//        ‘Н’은 ‘H’처럼 보이지만 ‘n’으로 읽는다.
//        ‘Р’은 ‘P’처럼 보이지만 ‘r’으로 읽는다.
//        ‘С’는 ‘C’처럼 보이지만 ‘s’로 읽는다.
//        ‘У’는 ‘Y’처럼 보이지만 ‘u’로 읽는다.
//        ‘Х’는 ‘X’처럼 보이지만 ‘h’로 읽는다.

        for(int i = 0; i < s.length; i++) {

            switch (s[i]) {
                case "B" : sb.append("v"); break;
                case "E" : sb.append("ye"); break;
                case "H" : sb.append("n"); break;
                case "P" : sb.append("r"); break;
                case "C" : sb.append("s"); break;
                case "Y" : sb.append("u"); break;
                case "X" : sb.append("h"); break;
                default: sb.append(s[i].toLowerCase()); break;
            }
        }

        System.out.println(sb.toString());

    }
}
