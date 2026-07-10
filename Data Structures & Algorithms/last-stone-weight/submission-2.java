class Solution {
    public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int num : stones) pq.add(num);
		
		int first;
		int second;
		
		while(!pq.isEmpty() && pq.size() >= 2) {
			first = pq.poll();
			second = pq.poll();
			
			if(first - second != 0) pq.add(first - second);
		}

        if(pq.size() == 0) return 0;
		
		return pq.poll();	
    }
}
