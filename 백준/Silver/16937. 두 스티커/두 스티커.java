import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] stickers = new int[N][2];
        for (int i = 0; i < N; i++) {
            stickers[i][0] = scanner.nextInt();
            stickers[i][1] = scanner.nextInt();
        }

        int maxArea = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int[] sticker1 = stickers[i];
                int[] sticker2 = stickers[j];

                maxArea = Math.max(maxArea, getMaxArea(H, W, sticker1, sticker2));
            }
        }

        System.out.println(maxArea);

        scanner.close();
    }

    private static int getMaxArea(int H, int W, int[] s1, int[] s2) {
        int maxArea = 0;

        int[][] orientations1 = {{s1[0], s1[1]}, {s1[1], s1[0]}};
        int[][] orientations2 = {{s2[0], s2[1]}, {s2[1], s2[0]}};

        for (int[] o1 : orientations1) {
            for (int[] o2 : orientations2) {
                if (fitsInGrid(H, W, o1[0] + o2[0], Math.max(o1[1], o2[1]))) {
                    maxArea = Math.max(maxArea, o1[0] * o1[1] + o2[0] * o2[1]);
                }
                if (fitsInGrid(H, W, Math.max(o1[0], o2[0]), o1[1] + o2[1])) {
                    maxArea = Math.max(maxArea, o1[0] * o1[1] + o2[0] * o2[1]);
                }
            }
        }

        return maxArea;
    }

    private static boolean fitsInGrid(int H, int W, int width, int height) {
        return (width <= H && height <= W) || (width <= W && height <= H);
    }
}
