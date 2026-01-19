class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
 
        map.put(0,1);
        int count = 0;
        int preSum = 0;

        for(int i = 0; i < nums.length; i++){
           preSum += nums[i];
           int rem = ((preSum % k) + k) % k;
           count += map.getOrDefault(rem,0);
           map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}