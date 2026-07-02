class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int countLCS = 1;
        int maxCount = 1;

        if(nums.length == 0) return 0;

        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] == nums[i]) continue;
            else if(nums[i] - nums[i-1] == 1) countLCS++;
            else {
                maxCount = Math.max(maxCount, countLCS);
                countLCS = 1;
            }
        }

        maxCount = Math.max(maxCount, countLCS);

        return maxCount;
    }
}
