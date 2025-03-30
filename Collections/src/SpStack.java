//Question3)
//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and
//an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))

import java.util.Stack;

class SpStack {
    private Stack<Integer> stack;
    private int min;
    private int size;

    public SpStack(int size) {
        this.size = size;
        this.stack = new Stack<>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full" + data);
            return;
        }
        if (stack.isEmpty()) {
            min = data;
            stack.push(data);
        } else {
            if (data < min) {
                stack.push(2 * data - min);
                min = data;
            } else {
                stack.push(data);
            }
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = stack.pop();
        if (top < min) {
            int originalMin = min;
            min = 2 * min - top;
            return originalMin;
        }
        return top;
    }

    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return min;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == size;
    }

    public void display() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        SpStack stack = new SpStack(5);

        stack.push(10);
        stack.push(5);
        stack.push(20);
        stack.push(3);
        stack.push(8);

        System.out.println("Minimum Element: " + stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println("Minimum Element after popping: " + stack.getMin());
    }
}
