package interview.test;

public class RemoveDuplicateWithTwoPointerConcept {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int left=0;
        int right=nums.length-1;
        int target = 0;
        boolean flag = false;
        while (left < right) {
            int subtract = nums[left] - nums[right];
            if (subtract == target) {
                flag = true;
                System.out.println("Duplicate Number: " + nums[left]+" and "+nums[right]);
            }
            if (subtract > target) {
                left++;
            }
            else {
                right--;
            }
        }
        if (!flag) {
            System.out.println("No duplicate number");
        }
    }
}
