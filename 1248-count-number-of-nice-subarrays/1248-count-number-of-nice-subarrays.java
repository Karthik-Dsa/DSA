class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
           if((nums[i] & 1) == 1){
            nums[i] = 1;
           }else{
            nums[i] = 0;
           }
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum = 0;

        for(int num : nums){
           preSum += num;
           cnt += map.getOrDefault(preSum - k,0);
           map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
}