import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static ArrayList<BigInteger> answer;
    public static void getNum(String input){
        String s_number = "";
        for(int i=0;i<input.length();i++){
            char x = input.charAt(i);
            if(x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9'){
                s_number+=x;
            }
            else{
                if(s_number!=""){
                    answer.add(new BigInteger(s_number));
                    s_number="";
                }
            }
        }
        if(s_number!=""){
            answer.add(new BigInteger(s_number));
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        answer = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            String tmp = br.readLine();
            getNum(tmp);
        }
        Collections.sort(answer);
        for(BigInteger s:answer){
            System.out.println(s);
        }
    }
}