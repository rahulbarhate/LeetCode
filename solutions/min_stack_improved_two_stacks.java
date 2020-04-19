class MinStack
{
    private Stack<Integer> stack  = new Stack<>();
    private Stack<int[]> minStack  = new Stack<>();
    
    /** initialize your data structure here. */
    public MinStack() 
    {
        
    }
    
    public void push(int x)
    {
        stack.push(x);
        if(minStack.isEmpty() || x < minStack.peek()[0])
        {
            minStack.push(new int[]{x,1});
        }
        
        else if (x == minStack.peek()[0])
        {
            minStack.peek()[1]++;
        }
    }
    
    public void pop()
    {
        if(stack.peek().equals(minStack.peek()[0]))
        {
            minStack.peek()[1]--;
        }
        
        //If the count at minStack is now 0, then remove the value
        if(minStack.peek()[1] == 0)
        {
            minStack.pop();
        }
            
        stack.pop();  
    }
    
    public int top()
    {
        return stack.peek();
    }
    
    public int getMin()
    {
        return minStack.peek()[0];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
