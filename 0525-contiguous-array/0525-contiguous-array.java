class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int subArrLen = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i] == 0 ? -1 : 1;

            if(sum == 0){
                subArrLen = i + 1;
            }else if(map.containsKey(sum)){
                subArrLen = Math.max(subArrLen,i - map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return subArrLen;
    }
}