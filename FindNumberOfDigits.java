class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int evenCount = 0;
        
        for ( int i : nums)
        {
            int mod = i;
            while ( mod > 0 )
            {
                mod = mod / 10;
                count++;
            }
            if ( count % 2 == 0 )
            {
                evenCount++;
            }
            count = 0;
        }
        
        return evenCount;
    }
}
