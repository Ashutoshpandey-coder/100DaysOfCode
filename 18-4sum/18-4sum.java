class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
           List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int i = 0;
        while(i<=nums.length-4){
            int j = i+1;
            while(j<=nums.length-3){
                int left = j+1;
                int right = nums.length-1;
                int comp = target - (nums[i] + nums[j]);
                while(left<right){
                    if(nums[left] + nums[right] == comp){
                        List<Integer> newList = new ArrayList<Integer>();
                        newList.add(nums[i]);
                        newList.add(nums[j]);
                        newList.add(nums[left]);
                        newList.add(nums[right]);
                        if(!list.contains(newList))
                            list.add(newList);
                        do{
                            left++;
                        }while(left<right && nums[left-1] == nums[left] );
                        do{
                            right--;
                        }while(left<right && nums[right+1] == nums[right]);
                    }else if(nums[left] + nums[right] < comp) left++;
                    else right--;
                }
                do{ 
                    j++;
                }while(j<nums.length-3 && nums[j-1] == nums[j]);
            }
            do{
                i++;
            }while(i<nums.length-4 && nums[i-1] == nums[i]);
        }
        return list;
    }
}