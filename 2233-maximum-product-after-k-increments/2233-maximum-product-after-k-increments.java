class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i<nums.length ; i++){
            pq.offer(nums[i]);
        }
        for(int i=0 ; i<k ; i++){
            int pop = pq.poll();
            pq.offer(pop+1);
        }
        long product = 1;
        int mod = 1000000007;
        while(!pq.isEmpty()){
            product = (product*pq.poll())%mod;
        }
        return (int)product;
    }
}