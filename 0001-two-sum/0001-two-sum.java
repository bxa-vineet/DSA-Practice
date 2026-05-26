class Solution {
    public int [] twoSum(int[] nums, int target) {
        // int ans[] =new int[2];
        // ans[0]= -1;
        // ans[1] = -1;
        // int n = nums.length;
        // Arrays.sort(nums);
        // int left = 0;
        // int right = n-1;

        // while(left<right){
        //     int sum = nums[left] + nums[right];
        //     if(sum==target){
        //         ans[0] = left;
        //         ans[1] = right;
        //         return ans;
        //     }else if(sum>target){
        //         right--;
        //     }else {
        //        left++;
        //     }

        // }  
        // return ans;
       int n = nums.length;
       int arr[] = new int[2];
       if(n == 2 && nums[0] + nums[1] == target){
        arr[0] = 0;
        arr[1] = 1;
        return arr;

       }
       arr[0]= -1;
       arr[1] = -1;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<n; i++){
        int sum = nums[i];
        int moreNeeded = target - sum;
        if(map.containsKey(moreNeeded)){
            arr[0] = i;
            arr[1] = map.get(moreNeeded);
            return arr;
        }

        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
       }
       return arr;

    }
}
