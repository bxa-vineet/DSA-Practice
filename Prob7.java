//You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's
//you have to sort them in ascending order.
//Return the array after sorting it.
class Solution {
    public int[] sortByBits(int[] arr){
        Integer temp[] = new Integer[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[i]  =arr[i];
        }
        Arrays.sort(temp, (a,b) ->{
            int bita = Integer.bitCount(a);
            int bitb = Integer.bitCount(b);
            if( bita != bitb){
                return bita - bitb;
            }
            return a - b;

        });
        for(int i=0 ;i<arr.length; i++){
            arr[i] = temp[i];
        }
        return arr;

    }
}