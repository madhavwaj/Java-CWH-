public class MaxWealth_leetcode {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        //person = row
        //account = column
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //when you start a new column, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            //now we have sum of accounts of person
            //check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
