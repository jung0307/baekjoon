import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[31];
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = 1; i <= arr.length-3; i++){
            int num = scanner.nextInt();
            arr[num] = num;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) {
                arr2.add(i);
            }
        }
        System.out.println(arr2.get(1));
        System.out.println(arr2.get(2));
    }

}
