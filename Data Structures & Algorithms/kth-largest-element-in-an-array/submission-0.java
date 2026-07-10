class Solution {
    public static int findKthLargest(int[] nums, int k) {
    	PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
    	
    	for(int num : nums) {
    		pq.add(num);	
    	}	
    	
    	int i = 1;
    	
    	System.out.println("Pq: " + pq);
		
		while(i < k) {
			pq.poll();
			i++;
		}
		
        return pq.poll();
    }	
}
