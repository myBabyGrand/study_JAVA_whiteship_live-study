package week04_controlStatement;

public class QueueWithListNode implements Queue{
    ListNode head;
    int tail;
    public QueueWithListNode(){
        this.head = null;
        this.tail = -1;
    }
    @Override
    public void add(int data) {
        ListNode inputNode = new ListNode(data);
        if(head == null){
            head = new ListNode(data);
            tail++;
        }else{
            head = head.add(head, inputNode, ++tail);
        }
    }

    @Override
    public int peek() {
        return head.data;
    }

    @Override
    public int poll() {
        if(tail == -1){
            System.out.println("Empty");
            return tail;
        }
        ListNode rtnListNode = head.remove(this.head, 0);
        tail--;
//        listNode = listNode.present;
        head = head.next;
        return rtnListNode.data;
    }
}

