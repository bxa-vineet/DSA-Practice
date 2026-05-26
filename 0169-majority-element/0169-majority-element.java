class Solution {
    public int majorityGureenty(int arr[]){
        int n = arr.length;
        int count = 0;
        int candidate = 0;
        for(int num : arr){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }else{
                count--;
            }
        }
        return candidate;

    }
    public int majorityElement(int[] arr) {

 //         HashMap<Integer,Integer> map = new HashMap<>();
             // for(int num : nums){
            //     map.put(num, map.getOrDefault(num,0)+1);
           //     if(map.get(num) > nums.length/2){
          //         return num;
         //     }
        // }
    //     Arrays.sort(v);
    //     int n = v.length;
    //     for (int i = 0; i < n; i++) {
    //         int cnt = 1;
    //         for (int j = i+1; j < n; j++) {
    //             if (v[j] == v[i]) {
    //                 cnt++;
    //             }
    //         }
    //         if (cnt > (n / 2))
    //             return v[i];
    //     }

    //     return -1;
        
        // Moore algorithm
        int number = majorityGureenty(arr);
        return number;
     }

}