import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] nums, int min, int max) {
        int n = nums.length;
        int k = max - min + 1;
        int[] c = new int[k]; // 技术数组 长度数数组的长度

        for (int v : nums) {
            c[v - min]++; // 计数同时映射下标从 0 开始； v-min获得正确的下标
            System.out.println("统计数组 c: " +Arrays.toString(c));
        }
        System.out.println("------------------");
        for (int i = 1; i < k; i++) {
            c[i] += c[i - 1]; // 累加前面的数字 也就是≤i 的数字的个数
            System.out.println("累计数组 c: " +Arrays.toString(c));
        }

        int[] r = new int[n]; // 结果数组
        for (int i = n - 1; i >= 0; i--) {
            int v = nums[i]; //当前数值
            int a = c[v - min]; // 在结果数组中的位置 
            r[a - 1] = v;
            System.out.println(Arrays.toString(r));
            c[v - min]--;
        }
        System.arraycopy(r, 0, nums, 0, n);
    }

    public static void main(String[] args) {

        // test case 1
        // int[] nums = {1, 2, 2, 2, 37, 9, 5, 5, 8};
        // countingSort(nums, 1, 37);
        // System.out.println(Arrays.toString(nums));

        // test case 2
        int[] nums2 = {2, 7, 9, 5, 5, 8};
        countingSort(nums2, 2, 9);
        System.out.println(Arrays.toString(nums2));
    }
}
