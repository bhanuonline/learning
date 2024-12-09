package interview.coding.twopointers;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum == target) {
                return new int[] {low, high};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[] {}; // No solution
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 7, 11};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
