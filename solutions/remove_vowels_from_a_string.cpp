class Solution
{
public:
    string removeVowels(string S) 
    {
        string res="";
        for(int i = 0; i < S.size();i++)
        {
                    if (S[i] == 'a' ||S[i] == 'e' ||S[i] == 'i' ||S[i] == 'o'||S[i] == 'u' || S[i] == 'A' ||S[i] == 'E' ||S[i] == 'I' ||S[i] == 'O'||S[i] == 'U')
                    {
                        continue;
                    } 
                    else 
                    {
                        res+=S[i];
                    }
        }
        return res;
    }
};
