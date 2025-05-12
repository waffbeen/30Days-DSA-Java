import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int result=0,temp=0;

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        while (temp < s.length()) 
        {
            int i=romanMap.get(s.charAt(temp));
            int j=0;
            if (temp + 1 < s.length()) 
            {
                j = romanMap.get(s.charAt(temp + 1));
            }

            if (i < j) 
            {
                result += (j - i);
                temp += 2;

            } else 
            {
                result += i;
                temp++;

            }
        }

        return result;
    }
}

