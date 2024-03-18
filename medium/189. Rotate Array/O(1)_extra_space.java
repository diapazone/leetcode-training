class Solution {
    public void rotate(int[] nums, int k) {        
        while (k > 0){
            int bufferA = 0;
            int bufferB = nums[nums.length-1];
            for (var i = 0; i < nums.length; i++){
                bufferA = nums[i];
                nums[i] = bufferB;
                bufferB = bufferA;
            }
            k--;
        }
    }
}