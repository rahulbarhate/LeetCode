class Solution 
{
public:
    bool isValid(string s)
    {
        stack<char> st;
        
        for(char c: s)
        {
            if(st.empty() || c == '(' || c == '[' || c == '{')
            {
                st.push(c);
            }
            
            else
            {
                if(c == ')' && st.top() != '(')
                    return false;
                if(c == ']' && st.top() != '[')
                    return false;
                if(c == '}' && st.top() != '{')
                    return false;
                
                st.pop();
            }
            
        }
        
        return st.empty();
        
    }
};