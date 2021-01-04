package week04_controlStatement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {
    private ListNode listNode;
    private static final int[] ADD_DATA = {1,3,4,5,7,9};
    private static final boolean[] CONTAINS_DATA = {true, false, true};
    private static List<Integer> acc_data;

    @BeforeEach
    void setUp() {
        acc_data = new ArrayList<>();
        listNode = new ListNode();
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(3);
        ListNode thirdNode = new ListNode(5);
        ListNode fourthNode = new ListNode(7);
        ListNode fifthNode = new ListNode(9);

        this.listNode = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
    }
    @Test
    void add() {
        listNode = listNode.add(listNode,new ListNode(4),2);

        while(listNode != null){
            acc_data.add(listNode.data);
            listNode = listNode.next;
        }

        for(int i=0;i<acc_data.size();i++) {
            Assertions.assertEquals(ADD_DATA[i],acc_data.get(i));
        }

    }

    @Test
    void remove() {
        ListNode removed = listNode.remove(listNode,2);
        Assertions.assertEquals(5,removed.data);
    }

    @Test
    void contains() {
        boolean[] result = new boolean[3];
        result[0] = listNode.contains(listNode,new ListNode(9));//last case : next is null
        result[1] = listNode.contains(listNode,new ListNode(10));
        result[2] = listNode.contains(listNode,new ListNode(7));//mid case : next value must be identified.
        for (int i = 0; i < CONTAINS_DATA.length; i++) {
            Assertions.assertEquals(CONTAINS_DATA[i], result[i]);
        }
    }
}