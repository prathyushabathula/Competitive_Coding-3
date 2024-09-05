// Time Complexity :O(2n) ~ O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class K-DiffPairs {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int count = 0;
        int n = nums.length;
        for(int i=0; i <n; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for(int r : map.keySet()) {
            if(map.containsKey(r+k) && k > 0) {
                count++;
            } 
            else if (k == 0 && map.get(r) >= 2)
            {
                count++;
            }
        }
    return count;    

    }
}