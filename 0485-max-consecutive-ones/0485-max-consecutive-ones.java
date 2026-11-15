class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int consucative=0;
        // boolean check=false;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(consucative<count){
                    consucative=count;
                }
            }
            else{
                count=0;
            }
            
        }
        return consucative;
        
    }
}