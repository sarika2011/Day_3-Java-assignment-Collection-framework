package testExeercise;

import java.util.Stack;

/* 3).Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))*/
public class SpecialStack extends Stack<Integer>{
	
	Stack<Integer> minStack = new Stack<>();


    public void push(int x) {
        if (isEmpty()) {
            super.push(x);
            minStack.push(x);
        } else {
            super.push(x);
            int y = minStack.pop();
            minStack.push(y);
            minStack.push(Math.min(x, y));
        }
    }

    public Integer pop() {
        int x = super.pop();
        minStack.pop();
        return x;
    }

    public int getMin() {
        int x = minStack.pop();
        minStack.push(x);
        return x;
    }

}
