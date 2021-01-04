package week04_controlStatement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListWitListNodeTest {
    private static final int[] ADD_DATA = {1,3,5,7,9};
    private static final boolean[] CONTAINS_DATA = {true, false,true};
    private static List<Integer> acc_data;
    private static LinkedListWitListNode linkedList;
    @BeforeEach
    void setUp() {
        acc_data = new ArrayList<>();
        linkedList= new LinkedListWitListNode();
        linkedList.add(new ListNode(7),0);
        linkedList.add(new ListNode(5),0);
        linkedList.add(new ListNode(3),0);
        linkedList.add(new ListNode(1),0);
    }
    @Test
    void get() {
        for (int i = 0; i < ADD_DATA.length-1; i++) {
            Assertions.assertEquals(ADD_DATA[i],linkedList.get(i));
        }
    }

    @Test
    void add() {
        linkedList.add(new ListNode(9),4);
        Assertions.assertEquals(9, linkedList.get(4));
    }

    @Test
    void remove() {
        linkedList.add(new ListNode(9),4);
        linkedList.add(new ListNode(11),4);
        Assertions.assertEquals(11, linkedList.remove(4).data);//last
        Assertions.assertEquals(1, linkedList.remove(0).data);//first
        Assertions.assertEquals(3, linkedList.remove(0).data);//first
        Assertions.assertEquals(3, linkedList.size);
        Assertions.assertEquals(7, linkedList.remove(1).data);//mid
    }

    @Test
    void contains() {
        boolean result[] = new boolean[3];
        result[0] = linkedList.contains(new ListNode(3));//mid case
        result[1] = linkedList.contains(new ListNode(-1));
        result[2] = linkedList.contains(new ListNode(7));//last case
        for (int i = 0; i < CONTAINS_DATA.length; i++) {
            Assertions.assertEquals(CONTAINS_DATA[i], result[i]);
        }
    }
}