
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Store indices of elements in decreasing order of values
        int[] deque = new int[n];
        int front = 0;
        int rear = -1;
        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            // Remove indices outside the current window
            while (front <= rear && deque[front] <= i - k) {
                front++;
            }

            // Remove smaller elements from the back
            while (front <= rear &&
                   nums[deque[rear]] <= nums[i]) {
                rear--;
            }

            // Add the current index
            deque[++rear] = i;

            // Record maximum once the first window is complete
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque[front]];
            }
        }

        return result;
    }
}
