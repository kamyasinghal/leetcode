//18 October 2025

/*Question: 1480
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < runningSum.length; i++){
            sum += nums[i];                
            runningSum[i] = sum;
        }
        return runningSum;
    }
}