//26 october 2025

/*Hercy  starts by putting in $1 on Monday, the first day. 
Every day from Tuesday to Sunday, he will put in $1 more than the day before. 
On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at 
the end of the nth day.

ex: 
Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + 
(2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
*/

int totalMoney(int n) {
    int total = 0;
    int mon = 1, sun = 7;
    int week = n / 7;
    int extra_days = n % 7;
    if(n > 7){
        for(int i = 1; i <= week; i++){
            for (int j = mon; j<= sun; j++){
                total += j;
            }
            mon++;
            sun++;
        }
        
        for(int i = 1; i <= extra_days; i++){
            total += mon;
            mon++;
            
        }
    }
    else{
        while(n>0){
            total += n;
            n--;
        }
        
    }
    return total;
}