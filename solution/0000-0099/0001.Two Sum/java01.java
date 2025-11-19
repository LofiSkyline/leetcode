import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class java01 {
    public int[] Sum(int[] nums, int target){
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0;; ++i) {
            int x = nums[i];
            int y = target - x;
            if (d.containsKey(y)) {
                return new int[] {d.get(y), i};
            }
            d.put(x, i);
        }
    }
    

    public static void main(String[] args){
        java01 s  = new java01();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = s.Sum(nums, target);
        System.out.println("Result: "+ Arrays.toString(result));
    }
    
}
