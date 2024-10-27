import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = br.readLine()) != null) {
      int[] kangaroo = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
      int val1 = kangaroo[1] - kangaroo[0] - 1;
      int val2 = kangaroo[2] - kangaroo[1] - 1;
      System.out.println(Math.max(val1, val2));
    }
  }

}
