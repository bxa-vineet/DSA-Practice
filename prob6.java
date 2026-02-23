class prob6 {
    public static  boolean hasAllCodes(String s, int k) {
        int curr = 0; int mask = (1 << k) - 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            curr = ((curr << 1) & mask) | (s.charAt(i) - '0');
            if (i >= k - 1) {
                set.add(curr);
            }
        }
        long len = 1<<k;
        if(set.size() == len){
            return true;
        }
        return false;

    }

   public static void main(String args[]) {
        String s ="00110";
        int k = 2;
        boolean ans =  hasAllCodes(s,k);
       System.out.println(ans);

    }
}