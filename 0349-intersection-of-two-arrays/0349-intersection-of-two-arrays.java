class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
   

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