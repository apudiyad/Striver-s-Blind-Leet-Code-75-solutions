class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> temp = new HashSet();
        for(int i = 0; i < (nums.length); i++){
            temp.add(nums[i]);
        }
        if(temp.size() < nums.length) return true;
        return false;
    }
}