import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] arr = new int[nums.length][2];

        // Value aur original index store karo
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Value ke according sort karo
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Two pointers
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int sum = arr[i][0] + arr[j][0];

            if (sum == target) {
                return new int[] {arr[i][1], arr[j][1]};
            }

            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] {-1, -1};
    }
}