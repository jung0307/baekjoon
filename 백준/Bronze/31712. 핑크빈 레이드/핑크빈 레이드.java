import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");
        String s3[] = br.readLine().split(" ");
        int hp = Integer.parseInt(br.readLine());

        int Cu = Integer.parseInt(s1[0]);
        int Du = Integer.parseInt(s1[1]);
        int Cd = Integer.parseInt(s2[0]);
        int Dd = Integer.parseInt(s2[1]);
        int Cp = Integer.parseInt(s3[0]);
        int Dp = Integer.parseInt(s3[1]);
        int time = 0;

        hp = hp - (Du + Dd + Dp);

        //System.out.println("경과 시간 : " + time);

        while (hp > 0) {
            time++;

            //System.out.println("경과 시간 : " + time);

            if(time % Cu == 0) {
                hp = hp - Du;
                //System.out.println("윤이가 스킬을 썼습니다. 남은 체력 = " + hp);
            }
            if(time % Cd == 0) {
                hp = hp - Dd;
                //System.out.println("달구가 스킬을 썼습니다. 남은 체력 = " + hp);
            }
            if(time % Cp == 0) {
                hp = hp - Dp;
                //System.out.println("포닉스가 스킬을 썼습니다. 남은 체력 = " + hp);
            }
        }

        System.out.println(time);

    }
}
