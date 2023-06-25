
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrInt = new ArrayList<>();
        ArrayList<Integer> arrInt2 = new ArrayList<>();

        int a = -1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int b = 0;
            int c = 0;

            if(s.length > 1) {
                b = Integer.parseInt(s[1]);
                c = Integer.parseInt(s[2]);

                arrInt.add(b); // 점수
                arrInt2.add(c - 1); // 걸리는 시간

                a = arrInt.size() - 1; // 현재 위치

                if(arrInt2.get(a) == 0) {
                    sum = sum + arrInt.get(a);

                    boolean tf = false;

                    for(int j = a - 1; j >= 0; j--) {
                        if(arrInt2.get(j) != 0) {
                            a = j;
                            tf = true;
                            break;
                        }
                    }

                    if(tf == false) {
                        a--;
                    }

                }

            }else {
                if(a != -1) {
                    arrInt2.set(a , arrInt2.get(a) - 1);

                    if(arrInt2.get(a) == 0) {
                        sum = sum + arrInt.get(a);

                        boolean tf = false;

                        for(int j = a - 1; j >= 0; j--) {
                            if(arrInt2.get(j) != 0) {
                                a = j;
                                tf = true;
                                break;
                            }
                        }

                        if(tf == false) {
                            a--;
                        }

                    }
                }

            }
        
        }

        System.out.println(sum);

    }
}
