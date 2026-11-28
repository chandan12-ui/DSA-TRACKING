class Solution {
    public int majorityElement(int[] nums) {
    
    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    int num=Integer.MIN_VALUE;
    int freq=0;
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(freq<entry.getValue()){
            num=entry.getKey();
            freq=entry.getValue();
        }
    }
    return num;

    }
}