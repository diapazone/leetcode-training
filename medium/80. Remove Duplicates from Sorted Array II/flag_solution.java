class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        boolean newbee = true;
        for (var i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
                newbee = true;
            } else if (newbee){
                nums[k] = nums[i];
                k++;
                newbee = false;
            }
        }
        return k;
    }
}