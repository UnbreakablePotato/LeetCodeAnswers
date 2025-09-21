class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Write two for loops where I check int[0] with every other array element until we find the correct pair.
        int i;
        int j;
        int[] result = new int[2];
        for(i = 0; i<nums.length;i++){
            for(j = 0; j<nums.length;j++){
                int t = nums[i]+nums[j];
                

                if(t == target && i!=j){
                result[0] = j;
                result[1] = i;
                break;
                }
            }
        }
        return result;
        
    }
}
