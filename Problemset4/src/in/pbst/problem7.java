package in.pbst;

public class problem7 {

    public static int minJumps(int[] nums) {
        int n = nums.length;
        
        if (n <= 1) {
            return 0; 
        }
        
        if (nums[0] == 0) {
            return -1; 
        }
        
        int steps = 1; 
        int maxReach = nums[0]; 
        int end = nums[0]; 
        
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return steps;
            }
            
            maxReach = Math.max(maxReach, i + nums[i]); 
            
            if (i == end) {
                steps++; 
                end = maxReach; 
            }
            
            if (end >= n - 1) {
                return steps; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};

        int minJumps = minJumps(nums);
        System.out.println("Minimum number of jumps required: " + minJumps);
    }
}
