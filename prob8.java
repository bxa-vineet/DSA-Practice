//Check if Binary String Has at Most One Segment of Ones
class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zeroFound = false;
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if(ch == '0'){
                zeroFound = true;
            }else if(zeroFound && ch == '1'){
                return false;
            }

        }
        return true;

    }
}