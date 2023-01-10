class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int sqr = 0;
        for (int i = 0; i < len; i++) {
            sqr = nums[i];
            sqr = sqr * sqr;
            arr[i] = sqr;
        }
        

        return arr;
    }
}
