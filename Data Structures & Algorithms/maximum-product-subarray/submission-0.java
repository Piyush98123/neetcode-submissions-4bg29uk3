class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int mul=nums[0];
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = mul;
                mul=min;
                min=temp;
            }
            mul=Math.max(nums[i],mul*nums[i]);
            min=Math.min(nums[i],min*nums[i]);
            max=Math.max(mul, max);
        }
        return max;
    }
}
