class Solution {
    public int reverse(int x) {
        int temp = x ;
        if ( temp < 0 ){
            temp = -temp ;
        }
        long result = 0 ;
        while ( temp != 0 ){
            int digit = temp % 10 ;
            result = (result*10) + digit ;
            temp /= 10 ;
        }
        if ( x < 0 ){
            result = -result ;
        }
        if ( result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ){
            return 0 ;
        }
        return (int)result ;
    }
}