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
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(nums[i], i);
        }
        return ans;
    }
}
