class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    //    HashSet<Integer> set1=new HashSet<>();
    //     HashSet<Integer> set2=new HashSet<>();
    //     int count=0;
    //     for(int i=0;i<nums1.length;i++){
    //         set1.add(nums1[i]);
    //     }

    //     for(int j=0;j<nums2.length;j++){
    //         if(set1.contains(nums2[j])){
    //             count++;
    //             set2.add(nums2[j]);
    //             set1.remove(nums2[j]);
    //         }
    //     }
    //     int[] result=new int[count];
    //     int index=0;
    //     for(int i:set2){
    //         result[index++]=i;
    //     }

    //     return result; 

         HashSet<Integer> set=new HashSet<>();
    ArrayList<Integer> interSection=new ArrayList<>();

    for(int i:nums1){
        set.add(i);
    }
    for(int i:nums2){
        if(set.contains(i)){
            interSection.add(i);
            set.remove(i);
        }
    }
    int[] array=new int[interSection.size()];
    int index=0;

    for(int i:interSection){
        array[index++]=i;

    }
    return array;
    }
}