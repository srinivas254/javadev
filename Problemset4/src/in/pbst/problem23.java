package in.pbst;

public class problem23 {

    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left <= right) {
            int minHeight = Math.min(leftMax, rightMax);

            if (height[left] <= height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                }
                water += Math.max(0, minHeight - height[left]);
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                }
                water += Math.max(0, minHeight - height[right]);
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trap(height);
        System.out.println("Amount of trapped water: " + trappedWater);
    }
}

