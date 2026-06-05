class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums){
      List<Integer> list = new ArrayList<>();
      int n = nums.length;
        for(int i=0; i<n; i++){
        int num = Math.abs(nums[i]);
        int index = num-1;
        nums[index] = -Math.abs(nums[index]);
       }
       for(int i=0; i<n; i++){
        if(nums[i]>0){
            list.add(i+1);
        }
       }
     
      return list;
        
    }
}