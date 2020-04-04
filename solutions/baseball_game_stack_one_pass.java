class Solution
{
    public int calPoints(String[] ops) 
    {
        int sum = 0;
		Stack<Integer> stack = new Stack<>();
        
		for (String op : ops)
        {
			if (op.equals("C"))
            {
				sum = sum - stack.pop();
			} 
            
            else if (op.equals("D"))
            {
				sum += 2 * stack.peek();
				stack.push(2 * stack.peek());
			} 
            
            else if (op.equals("+"))
            {
				int top = stack.pop();
				int newTop = stack.peek() + top;
				stack.push(top);
				stack.push(newTop);
				sum += newTop;
			} 
            
            else 
            {
				sum += stack.push(Integer.valueOf(op));
			}
		}
		return sum;
    }
}
