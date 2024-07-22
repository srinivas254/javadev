package in.pbst;

public class problem1 {

    public static void sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int temp;
        
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 2, 1, 0};
        
        System.out.println("Original array:");
        printArray(nums);
        
        sortArray(nums);
        
        System.out.println("\nSorted array:");
        printArray(nums);
    }
    
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
