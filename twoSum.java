class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans =new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i =0; i < n; i++){
            int current = nums[i];
            int required = target - nums[i];
            if(mpp.containsKey(required)){
                ans[0] = mpp.get(required);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i], i);
        }
        return ans;   
    }
    
}