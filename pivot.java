public class pivot {
    public static void main(String[] args) {

        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 1;
        int n = nums.length;

        int[] result = new int[n];

        int left = 0;   // index for < pivot
        int mid = 0;    // count of == pivot
        int right = 0;  // count of > pivot

        // count positions
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) left++;
            else if (nums[i] == pivot) mid++;
        }

        int leftIndex = 0;
        int midIndex = left;
        int rightIndex = left + mid;

        // one loop to place elements
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                result[leftIndex++] = nums[i];
            } 
            else if (nums[i] == pivot) {
                result[midIndex++] = nums[i];
            } 
            else {
                result[rightIndex++] = nums[i];
            }
        }

        // print result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
