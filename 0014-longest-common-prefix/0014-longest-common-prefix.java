class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1 || strs[0] == " "){
            return strs[0];
        }
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length - 1];
        int n = Math.min(start.length(),end.length());
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<n; i++){
            if(start.charAt(i) == end.charAt(i)){
                sb.append(start.charAt(i));
            }else{
                break;
            }

        }
        return sb.toString();
    }
}