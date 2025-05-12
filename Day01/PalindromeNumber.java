class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,temp=0,n;
        n=x;
        if(n<0)
        return false;
        else{
        while(x!=0)
        {
            temp=x%10;
            sum=(sum*10)+temp;
            x=x/10;
        }
        if(sum==n)
        return true;
        else 
        return false;
    }
    }
}
