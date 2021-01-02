package week04_controlStatement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithArrayTest {
    private QueueWithArray arrayQueue;
    private static final int[] PUSH_DATA = {1,3,5,7,9};
    @BeforeEach
    void setUp() {
        arrayQueue = new QueueWithArray(5);
        arrayQueue.add(1);
        arrayQueue.add(3);
        arrayQueue.add(5);
        arrayQueue.add(7);
    }
    @Test
    void add() {
        arrayQueue.add(9);
        for(int i=0;i<arrayQueue.queue.length;i++){
            Assertions.assertEquals(PUSH_DATA[i],arrayQueue.queue[i]);
        }
    }

    @Test
    void peek() {
        for(int i=0;i<arrayQueue.queue.length;i++){
            Assertions.assertEquals(1,arrayQueue.peek());
        }
    }

    @Test
    void poll() {
        arrayQueue.add(9);
        for(int i=0;i<arrayQueue.queue.length;i++){
            Assertions.assertEquals(PUSH_DATA[i],arrayQueue.poll());
        }
    }
}