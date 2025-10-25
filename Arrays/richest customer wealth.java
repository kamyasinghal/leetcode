//18 October 2025

/*m x n integer grid accounts where accounts[i][j] is the money i'th person has in account j.
 * find the wealthiest customer. 
 * Eg: 
 * Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth  = 0;
        for(int i = 0; i < accounts.length; i++){
            int tempwealth = 0;
            for(int j = 0; j< accounts[i].length ; j++){
                tempwealth += accounts[i][j];
                if(tempwealth> wealth){
                    wealth = tempwealth;
                }
            }
        }

        return wealth;
    }
}