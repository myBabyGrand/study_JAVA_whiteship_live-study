package week04_controlStatement;

import java.util.NoSuchElementException;
import java.util.Objects;

public class ListNode {
    int data;
    ListNode next;
//    static ListNode present;
    public ListNode() {

    }

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    static ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        ListNode node = head;

        for (int i = 0; i < position - 1; i++) {
            node = node.next;
        }

        nodeToAdd.next = node.next;
        node.next = nodeToAdd;
//        present = node;
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
//            present = node.next;
            return delNode;
        }
        for(int i=0; i<positionToRemove-1;i++){
            node = node.next;
        }
        delNode = node.next;
        node.next = delNode.next;
//        present = node;
        return delNode;
    }

    static boolean contains(ListNode head, ListNode nodeTocheck) {
        while (head != null) {
            if (head.equals(nodeTocheck)) return true;
            head = head.next;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ListNode other = (ListNode) o;
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