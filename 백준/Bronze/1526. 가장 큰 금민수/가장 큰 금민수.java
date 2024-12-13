import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        final int inputNum = Integer.parseInt(br.readLine());

        for (int i = inputNum; i > 0; i--) {
            if (isGumMinSoo(i)) {
                System.out.print(i);
                break;
            }
        }
    }

    private static boolean isGumMinSoo(int i) {
        boolean retVal = true;
        char[] digits = String.valueOf(i).toCharArray();
        for (char ch : digits) {
            if (ch != '7' && ch != '4'){
                retVal = false;
                break;
            }
        }
        return retVal;
    }
}
