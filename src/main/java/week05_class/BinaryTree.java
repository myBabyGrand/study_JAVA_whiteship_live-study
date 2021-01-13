package week05_class;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://github.com/etff/whiteship-livestudy-5/blob/main/src/main/java/BinaryTree.java
public class BinaryTree {
    public List<Integer> bfsRlst = new ArrayList<>();
    public List<Integer> dfsRlst = new ArrayList<>();
    Node[] nodes;
    Node root;

    public Node getRoot(){
        return root;
    }

    public void addAll(int[] arr){

        nodes = new Node[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i]);
        }

        for (int i = 1; i < nodes.length; i++) {
            System.out.println("["+(i/2)+"]"+nodes[i/2].getValue()+" ["+i+"] "+nodes[i].getValue());
            if(i%2==1){
                nodes[i/2].setLeft(nodes[i]);
            }else{
                nodes[i/2 -1].setRight(nodes[i]);
            }

        }
        root = new Node(arr[0]);
        if(arr.length>2){
            root.setLeft(nodes[1]);
        }
        if(arr.length>3){
            root.setRight(nodes[2]);
        }
    }


    public void bfs(Node node){
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(node);
        while(!queue.isEmpty()){
            Node next = queue.removeFirst();
            bfsRlst.add(next.getValue());
            if(next.getLeft() != null){
                queue.addLast(next.getLeft());
            }
            if(next.getRight() != null){
                queue.addLast(next.getRight());
            }
        }
    }

    //dfs 순회 종류 : https://songeunjung92.tistory.com/29
    //PreOrder D->L->R 일반적으로 알고 있는 순서
    public void dfsPreOrder(Node node){
        if(node == null) return;

        dfsRlst.add(node.getValue());

        if(node.getLeft()!= null){
            dfsPreOrder(node.getLeft());
        }

        if(node.getRight()!= null){
            dfsPreOrder(node.getRight());
        }
    }
    //Inorder L->D->R
    public void dfsInOrder(Node node){
        if(node == null) return;

        if(node.getLeft()!= null){
            dfsInOrder(node.getLeft());
        }

        dfsRlst.add(node.getValue());

        if(node.getRight()!= null){
            dfsInOrder(node.getRight());
        }
    }
    //PostOrder L->R->D
    public void dfsPostOrder(Node node){
        if(node == null) return;

        if(node.getLeft()!= null){
            dfsPostOrder(node.getLeft());
        }

        if(node.getRight()!= null){
            dfsPostOrder(node.getRight());
        }
        dfsRlst.add(node.getValue());
    }
}
