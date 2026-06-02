class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums==null || nums.length < 3) return new ArrayList<>();
        Set<List<Integer>> res= new HashSet<>();
        Arrays.sort(nums);
        for (int i=0; i < nums.length -2; i++){
            int l=i+1;
            int m= nums.length-1;
            while(l<m){
                int sum= nums[l]+ nums[m]+ nums[i];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[m]));
                    l++;
                    m--;
                }
                else if (sum>0)
                    m--;
                else
                    l++;
            }
        }

        return new ArrayList<>(res);
    }
}
