package in.pbst;

public class problem18 {

    public static void rearrange(int[] nums) {
        int n = nums.length;
        int positiveIndex = 0;
        int negativeIndex = 0;

        while (positiveIndex < n && nums[positiveIndex] < 0) {
            positiveIndex++;
        }

        while (positiveIndex < n && negativeIndex < positiveIndex && nums[negativeIndex] < 0) {
            int temp = nums[negativeIndex];
            nums[negativeIndex] = nums[positiveIndex];
            nums[positiveIndex] = temp;
            positiveIndex++;
            negativeIndex += 2;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 4, 5, 6, -7, 8, 9};

        System.out.println("Original Array:");
        printArray(nums);
        rearrange(nums);
        System.out.println("Rearranged Array with alternating positive and negative items:");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
