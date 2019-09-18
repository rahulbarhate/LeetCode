class Solution {
public:
    vector<string> fizzBuzz(int n) 
    {
        vector<string> result;
        
        
        for(int i=1; i<=n; i++)
        {
            string answer = "";
            
            if(i%3==0)
            {
                answer += "Fizz";
            }
            if(i%5==0)
            {
                answer += "Buzz";
            }
            else if(answer == "")
            {
                answer += std::to_string(i);
            }
            
            result.push_back(answer);
        }
        
        return result;
    }
};