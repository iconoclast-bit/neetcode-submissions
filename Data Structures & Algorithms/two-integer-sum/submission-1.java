class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twosum1 = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            twosum1.put(nums[i], i);
        }
        int[] sum = new int[2];
        for(int j = 0 ; j < nums.length; j++){
            if(twosum1.containsKey(target-nums[j])){
                sum[0] = j;
                sum[1] = twosum1.get(target-nums[j]);
                if (sum[0]==sum[1]){
                    continue;
                } 
                return sum;
            }
        }
        sum[0] = 0;
        sum[1] = 0;
        return sum;
    }
}
