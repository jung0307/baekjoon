import java.io.*;
import java.util.*;
class Main {
    static int num = -1;
    static boolean[][] check = new boolean[10][10];
    static int[] di = {0, -1, 0, 1, 0};
    static int[] dj = {-1, 0, 1, 0, 0};
    static boolean check(int[] bulb){
        boolean check = true;
        for (int i = 0; i < 10; i++)
            if (bulb[i] != 0) check = false;
        return check;
    }
    static void dfs(int[] bulb, int row, int cnt) {
        if (row == 10){
            if (check(bulb))
                num = Math.max(num, cnt);
        }else {
            for (int i = 0; i < 10; i++){
                if ((bulb[row - 1] & (1 << i)) > 0) {
                    change(bulb, row, i);
                    cnt++;
                }
            }
            dfs(bulb, row + 1, cnt);
        }
    }
    static void change(int[] bulb, int x, int y){
        for (int k = 0; k < 5; k++){
            int i = x + di[k];
            int j = y + dj[k];
            if (i >= 0 && i < 10 && j >= 0 && j < 10) {
                if ((bulb[i] & (1 << j)) > 0)
                    bulb[i] = bulb[i] & ~(1 << j);
                else
                    bulb[i] = bulb[i] | (1 << j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] bulb = new int[10];
        for (int i = 0; i < 10; i++){
            String s = br.readLine();
            for (int j = 0; j < 10; j++)
                if (s.charAt(j) == 'O') bulb[i] = bulb[i] | (1 << j);
        }
        for (int i = 0; i <= 1024; i++){
            int[] new_bulb = bulb.clone();
            int cnt = 0;
            for (int j = 0; j < 10; j++)
                if ((i & (1 << j)) > 0) {
                    change(new_bulb, 0, j);
                    cnt++;
                }
            dfs(new_bulb, 1, cnt);
        }
        System.out.println(num);
    }
}