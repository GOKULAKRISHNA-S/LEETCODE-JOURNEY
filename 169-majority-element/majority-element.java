class Solution {
    public int majorityElement(int[] nums) {
        int result = 0 ;
        boolean visited[] = new boolean[nums.length] ;
        for ( int i = 0 ; i < nums.length ; i++ ){
            if ( visited[i] ){
                continue ;
            }
            int count = 0 ;
            for ( int j = 0 ; j < nums.length ; j++ ){
                if ( nums[i] == nums[j] ){
                    count++ ;
                    visited[j] = true ;
                }
            }
            if ( count > (nums.length/2) ){
                result = nums[i] ;
            }      
        }
        return result ;
    }
}