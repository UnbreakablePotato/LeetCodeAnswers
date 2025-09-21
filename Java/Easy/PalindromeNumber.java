class Solution {
    public boolean isPalindrome(int x) {
        int reversedNumber = 0;
        int n = x;
        while(n>0){
            reversedNumber = reversedNumber*10 + n%10;
            n=n/10;
        }

        if(reversedNumber==x){
            System.out.println(reversedNumber);
            return true;
        } else{
            System.out.println(reversedNumber);
            return false;
            
        }
    }
}
