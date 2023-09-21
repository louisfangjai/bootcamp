class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0,max=0;
        for (int i = 0; i < nums.length; i++){ //don't change as possible
        if(nums[i] == 1){
            count++;
            continue;
        }else{
            if( count > max){
                max=count; //max <-count, result count;
                }
                count=0;//reset
            }
        }
        //
        if(count>max)// 以防最後個count大過之前
        max = count;
        return max;
    }
}