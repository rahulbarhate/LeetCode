class Solution {
public:        
    bool isAlphabet(char x)
    {
        return( (x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') );
    }
    
    
    string reverseOnlyLetters(string S)
    {
        int l=0; 
        int r = S.size() -1;
        while(l<r)
        {
            if(!isAlphabet(S[l]))
                l++;
            else if(!isAlphabet(S[r]))
                r--;
            else
            {
                swap(S[l], S[r]);
                l++;
                r--;
            }
                
        }
        return S;
    }
    
};