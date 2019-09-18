class Solution {
public:
    vector<string> fizzBuzz(int n) 
    {
        vector<string> result;
        map <int, string> hashtable;
        
        
        hashtable.insert(pair<int, string>(3, "Fizz"));
        hashtable.insert(pair<int, string>(5, "Buzz"));
        
        for(int i=1; i<=n; i++)
        {
            string answer = "";
            
            map <int, string>::iterator itr;
            
            for(itr = hashtable.begin(); itr!=hashtable.end(); itr++)
            {
                if(i%itr->first == 0)
                {
                    answer += itr->second;
                }
            }
            
            if(answer == "")
            {
                answer += std::to_string(i);
            }
            
            result.push_back(answer);
        }
        
        return result;
    }
};