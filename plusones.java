/* Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9*/

class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer>result=new ArrayList<Integer>();
        if(digits.length==0||digits==null)
        { int[] temp={1};
            return temp;
        }
        int c=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(i==digits.length-1)
            {
                c=c+digits[i]+1;
            }else{
                c+=digits[i];
            }        
            result.add(0,c%10);
            c /=10;
        }
            if(c%10==1)
                result.add(0,1);
            int res[]=new int[result.size()];
            for(int i=0;i<result.size();i++)
                res[i]=result.get(i);
        return res;
    }
}
