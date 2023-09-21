// LeetCode:2395
class Solution {
    public boolean findSubarrays(int[] nums) {
        //Hashset// HashMap> 同key相關，重覆應該諗set，速度上
        Set<Integer> set = new HashSet<>();
        for(int i=0; i< nums.length-1;i++){ //因為唔洗loop到去最尾果粒，盡量唔郁 <,>,>=,<=
            if(!set.add(nums[i]+nums[i+1]))
            return true;
        }
        return false;
    }
}