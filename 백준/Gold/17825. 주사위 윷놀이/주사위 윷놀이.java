import java.io.*;
import java.util.*;

public class Main {
    static class Node{
        int score;
        boolean isEmpty;
        boolean isFinish;
        Node next;
        Node fastPath;

        public Node(int score) {
            this.score = score;
            this.isEmpty = true;
        }

        public Node addNext(int score) {
            Node next = new Node(score);
            this.next = next;
            return next;
        }

        public static Node findNode(Node start, int target) {
            Node tmp = start;
            while (true) {
                if(tmp == null) return null;
                if(tmp.score == target) return tmp;

                tmp = tmp.next;
            }
        }
    }

    private static int[] dice, order;
    private static Node[] horses;
    private static Node start;
    private static int ans = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        dice = new int[11];
        order = new int[11];
        horses = new Node[5];

        for (int i = 1; i <= 10; i++) {
            dice[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        init();
        permutation(1);

        System.out.println(ans);
    }

    private static void permutation(int depth) {
        if (depth == 11) {
            ans = Math.max(ans, gameStart());
            return;
        }

        for (int i = 1; i <= 4; i++) {
            order[depth] = i;
            permutation(depth + 1);
        }
    }

    private static int gameStart() {
        Arrays.fill(horses, start);

        int score = 0;
        for (int i = 1; i <= 10; i++) {
            Node cur = horses[order[i]];
            cur.isEmpty = true;

            for (int j = 1; j <= dice[i]; j++) {
                if (j == 1 && cur.fastPath != null) {
                    cur = cur.fastPath;
                } else {
                    cur = cur.next;
                }
            }

            horses[order[i]] = cur;

            if (!cur.isEmpty && !cur.isFinish) {
                score = 0;
                break;
            } else {
                cur.isEmpty = false;
                score += cur.score;
            }
        }

        for (int i = 1; i <= 4; i++) {
            horses[i].isEmpty = true;
        }

        return score;
    }

    private static void init() {
        start = new Node(0);

        Node tmp = start;
        for (int i = 2; i <= 40; i += 2) {
            tmp = tmp.addNext(i);
        }

        Node end = tmp.addNext(0);
        end.isFinish = true;
        end.next = end;

        Node crossNode = new Node(25);

        tmp = crossNode.addNext(30);
        tmp = tmp.addNext(35);
        tmp.next = Node.findNode(start, 40);

        tmp = Node.findNode(start, 10);
        tmp = tmp.fastPath = new Node(13);
        tmp = tmp.addNext(16);
        tmp = tmp.addNext(19);
        tmp.next = crossNode;

        tmp = Node.findNode(start, 20);
        tmp = tmp.fastPath = new Node(22);
        tmp = tmp.addNext(24);
        tmp.next = crossNode;

        tmp = Node.findNode(start, 30);
        tmp = tmp.fastPath = new Node(28);
        tmp = tmp.addNext(27);
        tmp = tmp.addNext(26);
        tmp.next = crossNode;
    }
}