package Intro_Lab_Tasks;

public class ArrayStack {

    private Object[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new Object[size];
        top = -1;
    }

    public void push(Object element) {
        int size = stack.length;    
        
        if (top+1 < size) {
            top += 1;
            stack[top] = element;
            System.out.println("Pushed item: " + element);
            return;
        } 
        System.out.println("Stack is full!");
    }

    public Object pop() {
        if (top == -1) {
            return "No item to peek";
        }
        Object item = stack[top];
        top -= 1;
        System.out.println("Popped item: " + item);
        return item;
    }

    public Object peek() {
        if (top == -1) {
            return "No item to peek";
        }
        Object item = stack[top];
        
        return item;
        
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }
    
}
