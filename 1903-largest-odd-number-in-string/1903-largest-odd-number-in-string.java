class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        if(n==0){
            return "";
        }
        int ld = num.charAt(n-1)-'0';
        if(ld%2 != 0){
            return num;
        }
        String ans = "";
       
            for(int j=n-1; j>=0; j--){
                if(num.charAt(j)%2 != 0){
                    return num.substring(0,j+1);
                }
        }
        return "";
    }
}