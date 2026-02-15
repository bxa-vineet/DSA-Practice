import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Prob2 {
    public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s  = br.readLine().trim();
        int maxCount = Integer.MIN_VALUE;
        int count = 1;
        if(count>maxCount){
            maxCount =count;
        }
        char ch = s.charAt(0);
       
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
                maxCount = Math.max(count,maxCount);
            }else{
                ch = s.charAt(i);
                count = 1;
            }

        }
        System.out.println(maxCount);

        

        
    
}

}
