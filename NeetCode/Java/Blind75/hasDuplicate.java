class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean check = false;
        for(var i = 0; i < nums.length;i++){
            for(var j = i+1; j < nums.length;j++){
                if(nums[i]==nums[j]){
                    check = true;
                }
            }
        }
        return check;
    }
}
