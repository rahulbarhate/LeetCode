class Solution
{
public:
    string removeVowels(string S) 
    {
        return string(S.begin(), remove_if(S.begin(), S.end(), [](char c){return c == 'a'||c == 'e'||c=='i'||c=='o'||c=='u';}));
    }
};
