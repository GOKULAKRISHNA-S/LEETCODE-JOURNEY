class Solution {
    public int[] finalPrices(int[] prices) {
        int answer[] = new int[prices.length] ;
        for ( int i = 0 ; i < prices.length ; i++ ){
            boolean found = false ;
            for ( int j = i+1 ; j < prices.length ; j++ ){
                if ( j > i && prices[j] <= prices[i] ){
                    answer[i] = prices[i] - prices[j] ;
                    found = true ;
                    break ;
                }
            }
            if ( !found ){
                answer[i] = prices[i] ;
            }
        }
        return answer ;
    }
}