package cww.world.datastructure;

/**
 * 数组模拟栈
 */
public class Stack {

    public static void main(String[] args) {

    }

}

class ArrayStack {

    private int maxSize;

    private int[] stack;

    private int top = -1;


    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    public Boolean isFull() {
        return top == maxSize;
    }


    public Boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            return;
        }
        top++;
        stack[top] = value;
    }


    public int pop() {
        if (isEmpty()) {
            new RuntimeException("stack 为空)");
        }

        int value = stack[top];
        top--;
        return value;
    }

    public void list() {
        if (isEmpty()) {
            return;
        }
        for (int index = top; top < 0; top--) {
            System.out.printf("value" + stack[index]);
        }
    }


}