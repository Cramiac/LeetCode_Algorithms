class Solution {
    public int searchInsert(int[] nums, int target){
        int start=1,end=nums.length;
        if (target<=nums[0]){
            return 0;
        }
        while (start<end){
            int mid=start+(end-start)/2;
            if (target<nums[mid]){
                end=mid;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
