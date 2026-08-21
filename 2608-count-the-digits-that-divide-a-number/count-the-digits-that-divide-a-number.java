class Solution {
    public int countDigits(int num) {
        int temp = num , result = 0 ;
        while ( temp != 0 ){
            int digit = temp % 10 ;
            if ( num % digit == 0 ){
                result++ ;
            }
            temp /= 10 ;
        }
        return result ;
    }
}