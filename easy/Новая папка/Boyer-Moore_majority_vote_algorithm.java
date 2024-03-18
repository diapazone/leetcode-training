class Solution {
    public int majorityElement(int[] nums) {
        int answer = 0;
        int count = 0;

        for (var i = 0; i < nums.length; i++){
            if (count == 0){
                answer = nums[i];
            }
            
            if (nums[i] == answer){
                count++;
            } else {
                count--;
            }
        }

        return answer;
    }
}