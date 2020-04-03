class Solution
{
    public int calPoints(String[] ops)
    {
        Stack<Integer> stack = new Stack();
        
        for(String op:ops)
        {
            if(op.equals("+"))
            {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            
            else if(op.equals("C"))
            {
                stack.pop();
            }
            else if(op.equals("D"))
            {
                stack.push(2 * stack.peek());
            }
            else
            {
                stack.push(Integer.valueOf(op));
            }
        }
        
        
        int ans = 0;
        for(int score:stack)
        {
            ans += score;
        }
        
        return ans;
    }
}
