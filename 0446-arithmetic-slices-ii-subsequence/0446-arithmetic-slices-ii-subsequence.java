public class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int total_count = 0;

        HashMap<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; ++i) {
            dp[i] = new HashMap<>();
        }

       
        
        /*
          In this techniqe we take an index i . then we take an index j
          .index j goes from 0 to i . the idea behind it is we want to find if there is
          a subsequence of j with i . and accordingly update a hashmap and count.
         */
        for (int i = 1; i < n; ++i) {// it checks all itemm fromm 0 index
            for (int j = 0; j < i; ++j) { // it takes all previous items. if we already had a subsequence than we update the count accordingly.
                long diff = (long) nums[i] - nums[j]; // take the difference between nums[i] and nums[j]
                if(diff > Integer.MAX_VALUE || diff < Integer.MIN_VALUE)continue;
                int diffInt = (int) diff;
                dp[i].put(diffInt, dp[i].getOrDefault(diffInt, 0) + 1);  // set the difference and update or initialize the count
                //here dp[i] is the current position.
                // and dp[j] is the previous position.
                if (dp[j].containsKey(diffInt)) { // checking if previous position of dp[j] contains the difference 
                    dp[i].put(diffInt, dp[i].get(diffInt) + dp[j].get(diffInt)); // updating the count because already exists.
                    total_count = total_count + dp[j].get(diffInt);// updating the total count.
                }
            }
        }
         
        return total_count;
    }
}