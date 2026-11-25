class Solution {
    public int removeDuplicates(int[] nums) 
    {
    //     int element=nums[0];
    //     int count=1;
    //     int index=1;
    //   for(int i=1;i< nums.length;i++){
    //       if(element==nums[i]){
    //           continue;
    //       }
    //       count++;
    //       element=nums[i];
    //       nums[index++]=nums[i];
    //   }
    //     return count;

    

        HashSet<Integer> set=new HashSet<>();
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[index++]=nums[i];
                
            }
        }
        
        
        return set.size();
    } 
}