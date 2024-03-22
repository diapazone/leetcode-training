class Solution {
    public boolean canJump(int[] nums) {
        int dist = 0;
        for (int num: nums){
            if (dist < 0) return false;
            if (num > dist) dist = num;
            dist--; 
        }
        return true;
    }
}