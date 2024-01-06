import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String[]> arr = new ArrayList<>();
        HashMap<String , Node> map = new HashMap<>();
        Tree tree = new Tree();

        for(int i = 0; i < n; i++) {
            String ss[] = br.readLine().split(" ");

            if(ss[1].equals(".") && ss[2].equals(".")) {
                map.put(ss[0] , new Node(ss[0] , null , null));
            }else {
                arr.add(ss);
            }
        }

        int cnt = 0;

        while (true) {

            if(cnt < arr.size()) {

                if(map.get(arr.get(cnt)[0]) == null) {

                    if(map.get(arr.get(cnt)[1]) != null && map.get(arr.get(cnt)[2]) != null) {
                        
                        map.put(arr.get(cnt)[0] , tree.makeNode(arr.get(cnt)[0] , map.get(arr.get(cnt)[1]) , map.get(arr.get(cnt)[2]) ) );
                    } else if (map.get(arr.get(cnt)[1]) != null && arr.get(cnt)[2].equals(".")) {
                        
                        map.put(arr.get(cnt)[0] , tree.makeNode(arr.get(cnt)[0] , map.get(arr.get(cnt)[1]) , null));
                    } else if (arr.get(cnt)[1].equals(".") && map.get(arr.get(cnt)[2]) != null) {
                     
                        map.put(arr.get(cnt)[0] , tree.makeNode(arr.get(cnt)[0] , null , map.get(arr.get(cnt)[2])));
                    }
                }

                cnt++;

            }else {

                cnt = 0;
            }


            int sum = 0;

            for(int i = 0; i < arr.size(); i++) {
                if(map.get(arr.get(i)[0]) == null) {
                    sum++;
                }
            }

            if(sum == 0) {
                break;
            }
        }


        tree.preOrder(map.get("A"));
        System.out.println();
        tree.inOrder(map.get("A"));
        System.out.println();
        tree.postOrder(map.get("A"));
        System.out.println();

    }


    public static class Node {
        private String data;
        private Node l;
        private Node r;

        public Node(String data , Node l , Node r) {
            this.data = data;
            this.l = l;
            this.r = r;
        }

        public void setLeftNode(Node node) {
            this.l = node;
        }

        public void setRightNode(Node node) {
            this.r = node;
        }

        public Node getLeftNode() {
            return this.l;
        }

        public Node getRightNode() {
            return this.r;
        }

    }

    public static class Tree {

        private Node newNode;

        public Node makeNode(String data , Node l , Node r) {
            newNode = new Node(data , l , r);

            return newNode;
        }

        public void preOrder(Node node) {
            if(node !=null) {
                System.out.print(node.data);
                preOrder(node.getLeftNode());
                preOrder(node.getRightNode());
            }
        }

        public void inOrder(Node node) {
            if(node != null) {
                inOrder(node.getLeftNode());
                System.out.print(node.data);
                inOrder(node.getRightNode());
            }
        }

        public void postOrder(Node node) {
            if(node !=null) {
                postOrder(node.getLeftNode());
                postOrder(node.getRightNode());
                System.out.print(node.data);
            }
        }
    }
}
