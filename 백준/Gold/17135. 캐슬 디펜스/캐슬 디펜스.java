import java.io.*;
import java.util.*;

public class Main {

    static int n, m, dist, res;
    static int[] archer;
    static int[][] castleMap;
    static List<int[]> monsterGroup;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static class Node implements Comparable<Node> {

        int x, y, d;

        Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }

        @Override
        public int compareTo(Node o) {
            if (this.d == o.d) {
                return this.y - o.y;
            } else
                return this.d - o.d;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dist = Integer.parseInt(st.nextToken());

        archer = new int[3];
        monsterGroup = new ArrayList<>();
        castleMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                castleMap[i][j] = Integer.parseInt(st.nextToken());

                if (castleMap[i][j] == 1) {
                    monsterGroup.add(new int[]{i, j});
                }
            }
        }

        locateArcher(0, 0);

        System.out.println(res);

        br.close();
    }

    private static void locateArcher(int index, int start) {
        if (index == 3) {
            List<int[]> newMonsterGroup = copy(monsterGroup);
            action(newMonsterGroup);
            return;
        }

        for (int i = start; i < m; i++) {
            archer[index] = i;
            locateArcher(index + 1, i + 1);
        }
    }

    private static List<int[]> copy(List<int[]> monsterGroup) {
        List<int[]> tmp = new ArrayList<>();

        for (int[] cur : monsterGroup) {
            tmp.add(new int[]{cur[0], cur[1]});
        }

        return tmp;
    }

    private static void action(List<int[]> newMonsterGroup) {
        int cnt = 0;

        while (!newMonsterGroup.isEmpty()) {
            List<int[]> targets = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                PriorityQueue<Node> pq = new PriorityQueue<>();

                for (int j = 0; j < newMonsterGroup.size(); j++) {
                    int[] cur = newMonsterGroup.get(j);
                    int diffDist = Math.abs(cur[0] - n) + Math.abs(cur[1] - archer[i]);
                    if (diffDist <= dist) {
                        pq.add(new Node(cur[0], cur[1], diffDist));
                    }
                }

                if (!pq.isEmpty()) {
                    Node target = pq.poll();
                    boolean flag = false;
                    for (int j = 0; j < targets.size(); j++) {
                        int[] cur2 = targets.get(j);
                        if (cur2[0] == target.x && cur2[1] == target.y) {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag) {
                        targets.add(new int[]{target.x, target.y});
                    }
                }
            }

            for (int i = 0; i < targets.size(); i++) {
                for (int j = newMonsterGroup.size() - 1; j >= 0; j--) {
                    if (targets.get(i)[0] == newMonsterGroup.get(j)[0] && targets.get(i)[1] == newMonsterGroup.get(j)[1]) {
                        newMonsterGroup.remove(j);
                        cnt++;
                        break;
                    }
                }
            }

            for (int i = newMonsterGroup.size() - 1; i >= 0; i--) {
                newMonsterGroup.get(i)[0] += 1;
                if (newMonsterGroup.get(i)[0] == n)
                    newMonsterGroup.remove(i);
            }
        }

        res = Math.max(res, cnt);
    }
}

