class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       Map<Integer,Integer> map = new HashMap<>();
       map.put(0,1);

       int preSum = 0;
       int cnt = 0;

       for(int num : nums){
         preSum += num;
         cnt += map.getOrDefault(preSum-goal,0);
         map.put(preSum,map.getOrDefault(preSum,0)+1);
       }
       return cnt;
    }
}