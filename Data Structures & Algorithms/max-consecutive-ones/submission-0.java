class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0,max=0;
    for(int n : nums){
        if(n == 1){
            temp++;
        }
        else{
            max=Math.max(max,temp);
            temp=0;
        }
    }
        return  max>temp?max:temp;
    }
}