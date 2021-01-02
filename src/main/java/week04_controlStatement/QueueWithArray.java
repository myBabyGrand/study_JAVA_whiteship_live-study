package week04_controlStatement;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueWithArray implements Queue{
    int[] queue;
    int tail;

    public QueueWithArray(int size) {
        this.queue = new int[size];
        this.tail = -1;
    }

    @Override
    public void add(int data) {
        queue[++tail] = data;
    }

    @Override
    public int peek() {
        return queue[0];
    }

    @Override
    public int poll() {
        int rtn = queue[0];
        int i=0;
        for(int j=1;j<queue.length;j++){
            queue[j-1] = queue[j];
        }
        queue[queue.length-1] = 0;
        tail--;
        return rtn;
    }
}
