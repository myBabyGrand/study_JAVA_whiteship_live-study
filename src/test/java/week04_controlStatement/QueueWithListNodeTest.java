package week04_controlStatement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithListNodeTest {
    private QueueWithListNode Queue;
    private static final int[] PUSH_DATA = {1,3,5,7,9};
    @BeforeEach
    void setUp() {
        Queue = new QueueWithListNode();
        Queue.add(1);
        Queue.add(3);
        Queue.add(5);
        Queue.add(7);
    }
    @Test
    void add() {
        Queue.add(9);
        int i=0;
        ListNode listNode = Queue.listNode;
        while(listNode != null){
            Assertions.assertEquals(PUSH_DATA[i],Queue.listNode.data);
            listNode = listNode.next;
        }
    }

    @Test
    void peek() {
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(1,Queue.peek());
        }
    }

    @Test
    void poll() {
        Queue.add(9);
        for (int i = 0; i < PUSH_DATA.length; i++) {
            int pollval = Queue.poll();
//            System.out.println(pollval+","+Queue.listNode.data);
            Assertions.assertEquals(PUSH_DATA[i],pollval);
        }
    }
}