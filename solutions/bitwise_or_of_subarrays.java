class Solution
{
    public int subarrayBitwiseORs(int[] arr) 
    {
        Set<Integer> answer = new HashSet();
        Set<Integer> current  =  new HashSet();
        
        current.add(0);
        for(int x: arr)
        {
            Set<Integer> current2 = new HashSet();
            for(int y: current)
            {
                current2.add(x | y);
            }
            current2.add(x);
            current = current2;
            answer.addAll(current);
        }
        
        return answer.size();
    }
}


/*
    
class Solution
{
    public int subarrayBitwiseORs(int[] arr) 
    {
        Set<Integer> answer = new HashSet();
        Set<Integer> current  =  new HashSet();
        
        current.add(0);
        for(int x: arr)
        {
            System.out.println("x: " + x);
            System.out.println("\n");
            Set<Integer> current2 = new HashSet();
            for(int y: current)
            {
                System.out.println("y: " + y);
                System.out.println("\n");
                System.out.println("x | y: " + (x | y));
                current2.add(x | y);
                System.out.println("current2:" + current2);
            }
            
            
            System.out.println("current2:" + current2);
             
        
            current2.add(x);
            
            System.out.println("current2:" + current2);
            
            current = current2;
            
            System.out.println("current:" + current);
            answer.addAll(current);
        }
        
        return answer.size();
    }
}

*/
