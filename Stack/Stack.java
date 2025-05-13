class Stack
{
    int stack[];
    int size;
    int pointer=0;

    Stack(int size)
    {
        this.size=size;
        this.stack = new int[size];
    }

    void push(int val) {
        if (pointer < stack.length) {
            stack[pointer] = val;
            pointer++;
        } else {
            System.out.println("Stack Overflow - stack is full");
        }
    }
    
   void pop() {
        if (pointer > 0) {
            pointer--;
            System.out.println("Popped: " + stack[pointer]);
            stack[pointer] = 0; // Optional: clear value
        } else {
            System.out.println("Stack Underflow - stack is empty");
        }
    }

      void peek() {
        if (pointer > 0) {
            System.out.println("Top Element: " + stack[pointer - 1]);
        } else {
            System.out.println("Stack is empty");
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.peek();    // Output: Top Element: 20
        s.pop();     // Output: Popped: 20
        s.peek();    // Output: Top Element: 10
        s.pop();     // Output: Popped: 10
        s.pop();     // Output: Stack Underflow - stack is empty
    }
}