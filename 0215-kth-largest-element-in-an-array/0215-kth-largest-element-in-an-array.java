class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        int n = nums.length;
        for(int i=0; i<n ; i++){
            q.offer(nums[i]);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}