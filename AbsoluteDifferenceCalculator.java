public class AbsoluteDifferenceCalculator {

    public static int sumOfAbsoluteDifferences(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += Math.abs(nums[i] - nums[i - 1]); // Calculate absolute difference
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 8, 4}; // Example array

        int result = sumOfAbsoluteDifferences(nums);
        System.out.println("Sum of absolute differences between adjacent numbers: " + result);
    }
}