class Solution {
    public boolean validPalindrome(String s) {
        int a=0, e=s.length()-1;

        while(a<e){
            if(s.charAt(a)!= s.charAt(e)){
                return isPalindrome(s.substring(0,a)+s.substring(a+1))||isPalindrome(s.substring(0,e)+s.substring(e+1));
            }
            a++;e--;
        }
        return true;
    }
    private boolean isPalindrome(String s){
        int a=0 , e=s.length()-1;
        while(a<e){
            if(s.charAt(a)!=s.charAt(e)){
                return false;
            }
            a++;
            e--;
        }
        return true;
    }
}