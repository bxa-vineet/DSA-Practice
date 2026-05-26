class Solution {
   
    public int subarraySum(int[] arr, int k) {
         int n = arr.length; 
        //   int cnt = 0; 

        // for (int i = 0 ; i < n; i++) { 
        //      int sum = 0;
        //     for (int j = i ; j < n; j++) { 
                
        //         sum += arr[j];
        //         if (sum == k)
        //             cnt++;
        //     }
        // }
        // return cnt;
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            sum =sum+arr[i];
            if(sum == k){
                count++;
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                count+= map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
   
    }
}