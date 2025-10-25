//18 October 2025

/* Question: 
 * return a string for each element in the string array: fizzbuzz if div by 3 and 5
 * fizz if div by 3
 * buzz if div by 5 
 * and the number itself as string if none of the above.
 */

package Strings;

import java.util.*; //for arraylist

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for(int i = 1; i <= n ;i++){
            if (i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            }
            else if( i % 3 == 0){
                answer.add("Fizz");
            }
            else if( i % 5 == 0){
                answer.add("Buzz");
            }
            else{
                answer.add(Integer.toString(i));
            }
        }
    return answer;
    }
}
