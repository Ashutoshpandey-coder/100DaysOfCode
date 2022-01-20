class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i] - 1))
                continue;
            else{
                int count = 1;
                int j = 1;
                while(set.contains(nums[i] + j)){
                    count++;j++;
                }
                res = Math.max(res,count);
            }
                
        }
        return res;
    }
}