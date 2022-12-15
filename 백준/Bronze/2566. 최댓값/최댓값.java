
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[][] arrInt = new int[9][9];
        int max;
        int[] arrInt2 = new int[2];

        for(int i = 0; i<9; i++){
            String s = br.readLine();
            String arr[] =s.split(" ");

            for(int j =0; j<9; j++){
                arrInt[i][j] = Integer.parseInt(arr[j]);
            }

        }

//        for(int i = 0; i < 9; i++) {
//
//            for(int j = 0; j < 9; j++) {
//                System.out.print(arrInt[i][j] + " ");
//            }
//            System.out.println();
//        }

        max = arrInt[0][0];
        arrInt2[0] = 0;
        arrInt2[1] = 0;

        for(int i = 0; i < 9; i++){

            for(int j = 0; j < 9; j++) {

                if(max < arrInt[i][j]){
                    max = arrInt[i][j];
                    arrInt2[0] = i;
                    arrInt2[1] = j;
                }

            }

        }

        System.out.println(max);
        System.out.println((arrInt2[0]+1) + " " + (arrInt2[1]+1));


    }

}
//        3 23 85 34 17 74 25 52 65
//        10 7 39 42 88 52 14 72 63
//        87 42 18 78 53 45 18 84 53
//        34 28 64 85 12 16 75 36 55
//        21 77 45 35 28 75 90 76 1
//        25 87 65 15 28 11 37 28 74
//        65 27 75 41 7 89 78 64 39
//        47 47 70 45 23 65 3 41 44
//        87 13 82 38 31 12 29 29 80