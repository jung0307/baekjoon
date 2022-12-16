
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arrInt = new int[n];

        for(int i = 0; i < n; i++) {

            int m = Integer.parseInt(br.readLine());
            arrInt[i] = m;
        }

        ArrayList<Integer> list = (ArrayList<Integer>) sortLtH(arrInt);
        bw.write(solution1(list)+"\n");
        bw.write(solution2(list)+"\n");
        bw.write(solution3(list)+"\n");
        bw.write(solution4(list)+"");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int solution1(List<Integer> list) {

        int sum = 0;

        for(Integer i : list) {
            sum = sum + i;
        }

        int answer = (int)Math.round((double)sum/list.size() );

        return answer;

    }

    public static int solution2(List<Integer> list) {

        return list.get(list.size()/2);

    }

    public static int solution3(List<Integer> list) {

        ArrayList<Integer> list2 = new ArrayList<>();

        if(list.get(0) < 0) {

            int temp[] = new int[ ( list.get(list.size()-1) - list.get(0) ) +1];
            ArrayList<Integer> list3 = new ArrayList<>();

            for(int i = 0; i < list.size(); i++) {
                list3.add(list.get(i)-list.get(0));
            }

            //System.out.println(list3.toString());

            for(int i = 0; i < list3.size(); i++) {
                temp[list3.get(i)]++;
            }

            int max = temp[0];

            for(int i = 0; i < temp.length; i++) {
                if(max < temp[i]) {
                    max = temp[i];
                }
            }

            for(int i = 0; i < temp.length; i++) {
                if(max == temp[i]) {
                    list2.add(i);
                }
            }

            //System.out.println(list2.toString());

            if(list2.size() > 1) {
                int answer = list2.get(1)+list.get(0);
                return answer;
            }else {
                int answer = list2.get(0)+list.get(0);
                return answer;
            }

        }else {
            int temp[] = new int[ (list.get(list.size()-1)) +1];

            for(int i = 0; i < list.size(); i++) {
                temp[list.get(i)]++;
            }

            int max = temp[0];

            for(int i = 0; i < temp.length; i++) {
                if(max < temp[i]) {
                    max = temp[i];
                }
            }

            for(int i = 0; i < temp.length; i++) {
                if(max == temp[i]) {
                    list2.add(i);
                }
            }


            if(list2.size() > 1) {
                int answer = list2.get(1);
                return answer;
            }else {
                int answer = list2.get(0);
                return answer;
            }
        }


    }

    public static int solution4(List<Integer> list) {

        int max = list.get(list.size()-1);
        int min = list.get(0);

        return max - min;

    }

    public static List sortLtH(int[] arrInt) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arrInt) {
            list.add(i);
        }

        Collections.sort(list);

        return list;
    }
}
