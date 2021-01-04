package week04_controlStatement;

import java.util.NoSuchElementException;

public class LinkedListWitListNode {
    static int size;
    static ListNode head;

    public LinkedListWitListNode() {
        this.head = head;
        this.size = 0;
    }

    static int get(int position){
        if(size == 0){
            throw new NullPointerException("LinkedList is Null");
        }
        if(position < 0 || position >= size){
            throw new NoSuchElementException();
        }
        ListNode node = head;
        for (int i = 0; i < position; i++) {
             node = node.next;
        }
        return node.data;
    }

    static void add(ListNode nodeToAdd, int position){
        head = ListNode.add(head, nodeToAdd, position);
        size++;
    }

    static ListNode remove(int positionToRemove){
        ListNode rslt = ListNode.remove(head, positionToRemove);
        size--;
        head = ListNode.HEAD;
        return rslt;
    }

    static boolean contains(ListNode chkNode){
        return ListNode.contains(head, chkNode);
    }
}
