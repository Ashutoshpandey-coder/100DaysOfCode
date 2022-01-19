class Solution {
    public void nextPermutation(int[] nums) {
        int indOne = -1, indTwo = -1;
        for(int i = nums.length - 2; i>=0; i--){
            if(nums[i] < nums[i+1]) {
                indOne = i;
                break;
            }
        }
        for(int i = nums.length - 1; i>=0; i--){
            if(indOne != -1 && nums[i] > nums[indOne]){
                indTwo = i;
                break;
            }
        }
        if(indOne != -1 && indTwo != -1){
            int temp = nums[indOne];
            nums[indOne] = nums[indTwo];
            nums[indTwo] = temp;
        }
        
        // Arrays.sort(nums,nums[indOne + 1] , nums.length);
        reverseRemainingArray(nums,indOne+1);
    }
    public void reverseRemainingArray(int[] nums, int startingInd){
        int i = startingInd;
        int j = nums.length -1;
        while(i<= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}