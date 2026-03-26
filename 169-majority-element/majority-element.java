class Solution {
    public int majorityElement(int[] nums) {
        int vote=1,can=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==can) vote++;
            else vote--;
            if(vote==0){
                can=nums[i];
                vote=1;
            }
        }
        return can;

        
    }
}