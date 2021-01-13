package week05_class;

/*
int 값을 가지고 있는 이진 트리를 나타내는 Node 라는 클래스를 정의하세요.
를int value, Node left, right를 가지고 있어야 합니다.
BinrayTree라는 클래스를 정의하고 주어진 노드를 기준으로 출력하는 bfs(Node node)와 dfs(Node node) 메소드 구현하세요.
DFS는 왼쪽, 루트, 오른쪽 순으로 순회하세요.
 */
public class Node {
    private int value;
    private Node left,right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node addLeftNode(int value){
        Node node = new Node(value);
        setLeft(node);
        return node;
    }

    public Node addRightNode(int value){
        Node node = new Node(value);
        setRight(node);
        return node;
    }

}
