package week04_controlStatement;

import java.util.NoSuchElementException;
import java.util.Objects;

public class ListNode {
    int data;
    ListNode next;
    static ListNode HEAD;
    public ListNode() {

    }

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

//    public ListNode(int data, ListNode n) {
//        this.data = data;
//        this.next = n;
//    }

    static ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if(position < 0 || position > getSize(head)){
            throw new NoSuchElementException();
        }
        ListNode node = head;

        if(position == 0){
            nodeToAdd.next = node;
            HEAD = nodeToAdd;
            return nodeToAdd;
        }

        for (int i = 0; i < position - 1; i++) {
            node = node.next;
        }

        nodeToAdd.next = node.next;
        node.next = nodeToAdd;
        HEAD = head;
        return head;
    }

    static ListNode remove(ListNode head, int positionToRemove) {
        ListNode node = head;
        ListNode delNode;

        if(positionToRemove < 0 || positionToRemove > getSize(head)){
            throw new NoSuchElementException();
        }

        if(positionToRemove == 0){
            delNode = node;
            head = node.next;
            HEAD = node.next;
            return delNode;
        }
        for(int i=0; i<positionToRemove-1;i++){
            node = node.next;
        }
        delNode = node.next;
        node.next = delNode.next;

        HEAD = head;
        return delNode;
    }

    static boolean contains(ListNode head, ListNode nodeTocheck) {
        //object comparison : 마지막 node만 체크 가능하다(next = null이므로)
//        while (head != null) {
//            if (head.equals(nodeTocheck)) return true;
//            head = head.next;
//        }
//        return false;

        //value comparison
        while (head != null) {
            if (head.data == nodeTocheck.data) return true;
            head = head.next;
        }
        return false;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
//        System.out.println( this.getClass() != o.getClass() );
        if (o == null || this.getClass() != o.getClass()) return false;
        ListNode other = (ListNode) o;
//        System.out.println(this.data +" "+other.data );
//        System.out.println(Objects.equals(this.next, other.next));
        return this.data == other.data && Objects.equals(this.next, other.next);
    }

    static int getSize(ListNode head){
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
        return size;
    }
}