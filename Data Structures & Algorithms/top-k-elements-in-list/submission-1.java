class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> res =  map.keySet().stream().sorted((a,b)->map.get(b)-map.get(a)).limit(k).toList();
        return res.stream().mapToInt(Integer::intValue).toArray();

    }
}
