    static Deque<Integer> deque;
    /** Initialize your data structure here. */
    UserStack() {
         deque=new LinkedList<Integer>();
    }
    
    /** Push element X onto stack. */
    static void push(int X) {
        deque.addLast(X);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    static int pop() {
        return deque.removeLast();
    }
    
    /** Get the top element of the stack. */
    static int top() {
        return deque.getLast();
    }
    
    /** Returns whether the stack is empty. */
    static boolean empty() {
        if(deque.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
