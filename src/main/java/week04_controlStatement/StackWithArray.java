package week04_controlStatement;

public class StackWithArray implements Stack{
    int[] stack;
    int top;

    public StackWithArray(int size) {
        stack = new int[size];
        top = -1;
    }
    @Override
    public void push(int data) {
        top++;
        stack[top] = data;
    }
    @Override
    public int pop() {
        if(top == -1){
            System.out.println("Empty");
            return top;
        }
        return stack[top--];
    }
}
