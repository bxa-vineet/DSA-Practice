
//        You are given a binary string s. You are allowed to perform two types of operations on the string in any sequence:
//        Type-1: Remove the character at the start of the string s and append it to the end of the string.
//        Type-2: Pick any character in s and flip its value, i.e., if its value is '0' it becomes '1' and vice-versa.
//        Return the minimum number of type-2 operations you need to perform such that s becomes alternating.
//        The string is called alternating if no two adjacent characters are equal.
//        For example, the strings "010" and "1010" are alternating, while the string "0100" is not.

class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String S = s + s;
        int res = n;

        for (int i = 0; i < n; i++) {
            res = Math.min(res, minOperations(S.substring(i, i + n)));
        }

        return res;
    }

    public int minOperations(String s) {
        int[] op = new int[2];

        for (int i = 0; i < s.length(); i++) {
            op[(s.charAt(i) ^ i) & 1]++;
        }

        return Math.min(op[0], op[1]);
    }
}