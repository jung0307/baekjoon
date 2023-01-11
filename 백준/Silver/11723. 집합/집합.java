
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

//        add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
//        remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
//        check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
//        toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
//        all: S를 {1, 2, ..., 20} 으로 바꾼다.
//        empty: S를 공집합으로 바꾼다.

        Set<Integer> set = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            String a = s[0];
            int b = 0;
            if(!(s[0].equals("all") || s[0].equals("empty"))) {
                b = Integer.parseInt(s[1]);
            }

            switch (a) {
                case "add" : set.add(b);
                break;
                case "remove" : set.remove(b);
                break;
                case "check" :
                    if(set.contains(b)) {
                        sb.append("1\n");
                    }else {
                        sb.append("0\n");
                    }
                    break;
                case "toggle" :
                    if(set.contains(b)) {
                        set.remove(b);
                    }else {
                        set.add(b);
                    }
                    break;
                case "all" :
                    set.clear();
                    for(int l = 1; l <= 20; l++) {
                        set.add(l);
                    }
                    break;
                case "empty" :
                    set.clear();
            }

        }

        System.out.print(sb.toString());

    }
}
