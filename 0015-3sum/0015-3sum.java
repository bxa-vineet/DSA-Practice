class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
 
//   List<List<Integer>> ans = new ArrayList<>();
//   Set<List<Integer>> st = new HashSet<>();
//   int n = arr.length;
//         // check all possible triplets:
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     if (arr[i] + arr[j] + arr[k] == 0) {
//                         List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
//                         temp.sort(null);
//                         st.add(temp);
//                     }
//                 }
//             }
//         }

//         // store the set elements in the answer:
//         List<List<Integer>> ans = new ArrayList<>(st);
//         return ans;

     List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr); 
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //remove duplicates:
            if (i != 0 && arr[i] == arr[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        return ans;
        
    }
}