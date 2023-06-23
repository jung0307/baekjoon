

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]); // 곡 수
        int L = Integer.parseInt(s[1]); // 곡 길이
        int D = Integer.parseInt(s[2]); // 전화 주기

        Boolean arr[] = new Boolean[N + N - 1];
        ArrayList<Boolean> arrCall = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        int se = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                arr[i] = false; // 곡 재생
            }else {
                arr[i] = true; // 휴식
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == false) {
                se = se + L;

                //System.out.println("지금은 재생입니다 = " + se);

                arr1.add(se);
            }else {
                se = se + 5;

                //System.out.println("지금은 휴식입니다 = " + se);

                arr1.add(se);
            }
        }

        int se2 = 0;
        int j = 0;
        boolean tf = false;

        while (true) {
            if(j % 2 == 0) {
                arrCall.add(false); // 전화 대기
                se2 = se2 + D;
                tf = false;
                j++;
            }else {
                arrCall.add(true); // 전화 콜
                //se2 = se2 + 1;
                se2 = se2 + 0;
                tf = true;
                j++;
            }

            if(se2 >= se) {
                break;
            }
        }

        if(tf == false) {
            arrCall.add(true);
        }

        int se3 = 0;

        for(int i = 0; i < arrCall.size(); i++) {
            if(arrCall.get(i) == false) {
                se3 = se3 + D;


                //System.out.println("지금은 전화 대기중입니다. = " + se3);


                arr2.add(se3);
            }else {
                //se3 = se3 + 1;
                se3 = se3 + 0;


                //System.out.println("지금은 전화 중입니다. = " + se3);


                //arr2.add(se3);
            }
        }

        boolean tf2 = false;

        for(int i = 0; i < arr1.size() - 1; i++) {
            for(int k = 0; k < arr2.size(); k++) {
                if(i % 2 == 0) {
                    if(arr1.get(i) <= arr2.get(k) && arr2.get(k) < arr1.get(i + 1) ) {
                        System.out.println(arr2.get(k));
                        tf2 = true;
                        break;
                    }
                }
            }

            if(tf2 == true) {
                break;
            }
        }

        if(tf2 == false) {
            System.out.println(arr2.get(arr2.size() - 1));;
        }





    }
}
