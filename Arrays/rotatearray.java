// 14 december 2025
/*
189. Given an integer array nums, rotate the array to the right by k steps, 
where k is non-negative.

Ex: 
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        k = k % nums.length;
        for(int i = 0 ; i < k ; i++){
            res[i] = nums[nums.length - k + i];
        }
        int x = 0;
        for(int i = k; i < nums.length; i++){
            res[i]  = nums[x];
            x++;
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = res[i];
        }

        /*for(int i = 1; i<k ; i++){
            int temp = nums[nums.length - 1];
            for(int j = nums.length - 1 ; j >= 0; i--){
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }*/
    }
}