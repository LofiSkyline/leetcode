import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sumFinder{
    public int[] Finder(int[] numSeq, int target){
        Map <Integer, Integer> m = new HashMap<>();
        for(int i = 0; i<numSeq.length; ++i){
            int x = numSeq[i];
            int y = target - x;
            if(m.containsKey(y)){
                return new int[]{m.get(y),i};
            }
            m.put(x,i);
        }
        return new int[]{-1,-1};
    }

    public static void main (String[]args){
    sumFinder sd = new sumFinder();
    int[] seq1 = {1,3, 5, 6, 7, 12, 4};
    int target = 100;
    System.out.println(Arrays.toString(sd.Finder(seq1, target)));
    }
}


