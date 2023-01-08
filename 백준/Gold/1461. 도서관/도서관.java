

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);

        String s2[] = br.readLine().split(" ");
        int arrInt[] = new int[s2.length];

        for(int i = 0; i < s2.length; i++) {
            arrInt[i] = Integer.parseInt(s2[i]);
        }

        Arrays.sort(arrInt);

        ArrayList<Integer> arrInt1 = new ArrayList<>();
        ArrayList<Integer> arrInt2 = new ArrayList<>();

        arrInt1.add(0);
        arrInt2.add(0);

        for(int i = 0; i < arrInt.length; i++) {
            if(arrInt[i]> 0) {
                arrInt1.add(arrInt[i]);
            }else if(arrInt[i] < 0) {
                arrInt2.add(-arrInt[i]);
            }
        }

        Collections.sort(arrInt2);

//        for(int a : arrInt1) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//        for(int a : arrInt2) {
//            System.out.print(a + " ");
//        }
//        System.out.println();

        int sum = 0;


        if(arrInt1.get(arrInt1.size()-1) >= arrInt2.get(arrInt2.size()-1)) {
//            System.out.println("arrInt1이 더 크다");
            int z = arrInt2.size()-1;
            //int z1 = m/z;
            int z2 = 0;

            if(z < m) {
                z2 = 0;
                sum = sum + 2*arrInt2.get(z);
            }else {
                z2 = z%m;
                while (z2 <= z) {
                    sum = sum + 2*arrInt2.get(z2);
                    z2 = z2 + m;

                }
            }
//            System.out.println("sum 1 " + sum);
//
//            System.out.println("z : " + z);
//            System.out.println("z2 : " + z2);



            int x = arrInt1.size()-1;
            int x2 = 0;

            if(x < m) {
                x2 = 0;
                sum = sum + arrInt1.get(x);
            }else {
                x2 = x%m;
                while (x2 < x) {
                    sum = sum + 2*arrInt1.get(x2);
                    x2 = x2 + m;
                    if(x2 == x) {
                        sum = sum + arrInt1.get(x2);
                        break;
                    }
                }
            }

//            System.out.println("x : " + x);
//            System.out.println("x2 : " + x2);
//
//
//            System.out.println("sum 2 " + sum);

        }else {
            //System.out.println("arrInt2이 더 크다");
            int z = arrInt1.size()-1;
            //int z1 = m/z;
            int z2 = 0;

            if(z < m) {
                z2 = 0;
                sum = sum + 2*arrInt1.get(z);
            }else {
                z2 = z%m;
                while (z2 <= z) {
                    sum = sum + 2*arrInt1.get(z2);
                    z2 = z2 + m;

                }
            }

//            System.out.println("z : " + z);
//            System.out.println("z2 : " + z2);
//
//            System.out.println("sum 1 " + sum);

            int x = arrInt2.size()-1;
            int x2 = 0;

            if(x < m) {
                x2 = 0;
                sum = sum + arrInt2.get(x);
            }else {
                x2 = x%m;
                while (x2 < x) {
                    sum = sum + 2*arrInt2.get(x2);
                    x2 = x2 + m;
                    if(x2 == x) {
                        sum = sum + arrInt2.get(x2);
                        break;
                    }
                }
            }

//            System.out.println("x : " + x);
//            System.out.println("x2 : " + x2);
//
//
//            System.out.println("sum 2 " + sum);
        }

        System.out.println(sum);

    }
}
