package week04_controlStatement;

public class QueueWithListNode implements Queue{
    ListNode listNode;
    int tail;
    public QueueWithListNode(){
        this.listNode = null;
        this.tail = -1;
    }
    @Override
    public void add(int data) {
        ListNode inputNode = new ListNode(data);
        if(listNode == null){
            listNode = new ListNode(data);
            tail++;
        }else{
            listNode = listNode.add(listNode, inputNode, ++tail);
        }
    }

    @Override
    public int peek() {
        return listNode.data;
    }

    @Override
    public int poll() {
        if(tail == -1){
            System.out.println("Empty");
            return tail;
        }
        ListNode rtnListNode = listNode.remove(this.listNode, 0);
        tail--;
//        listNode = listNode.present;
        listNode = listNode.next;
        return rtnListNode.data;
    }
}

